package com.med.ws.controller.workflow;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.med.common.contants.ConfigMapHelper;
import com.med.common.contants.Constants;
import com.med.common.contants.ErrorConstants;
import com.med.common.exception.MEDException;
import com.med.common.utils.JWTUtils;
import com.med.ods.dao.PersAccountDAO;
import com.med.ods.dao.PersonCurrentDAO;
import com.med.ods.entity.PersAccount;
import com.med.ods.entity.PersonCurrent;
import com.med.ws.controller.service.ASLService;
import com.med.ws.controller.service.FirebaseCloudMessagingService;
import com.med.ws.controller.service.PersonalService;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.response.ResponseBody;
import com.med.ws.dto.type.rq.LoginRqType;
import com.med.ws.dto.type.rs.LoginRsType;

/**
 * @author Thanat
 * @category login @
 */
@Service
@Transactional
public class Login extends AbstractWorkflowController {

	private static Logger logger = LogManager.getLogger(Login.class);
	
	@Autowired
	PersAccountDAO persAccountDAO;
	
	@Autowired
	PersonCurrentDAO personCurrentDAO;
	@Autowired
	ASLService aslService;
	@Autowired
	PersonalService personalService;
	@Autowired
	FirebaseCloudMessagingService fcmService;
	
	@Override
	public ResponseBody processTask(ProcessBean processBean) throws Exception {
		
		LoginRqType loginRq = processBean.getRequest().getLoginRq();
		String username = loginRq.getName();
		String password = loginRq.getPassword();
		
		PersAccount account = persAccountDAO.findByUsername(username);
		try{
			LoginRsType alsLogin =  aslService.aslLogin(username, password);
			if(null != alsLogin){
//				personalService.createPerson(processBean.getRequest().getLoginRq(), alsLogin);
				fcmService.saveDeviceToken(loginRq.getFcmToken(), account.getPersId());
				return checkLogin(username, account, processBean);
			}else{
				throw new MEDException(ErrorConstants.LOGIN_ERROR);
			}
		}catch(MEDException me){
			throw me;
		}catch(NullPointerException ne){
			throw new MEDException(ErrorConstants.ACCOUNT_DOES_NOT_EXISTS);
		}
	}

	private ResponseBody checkLogin(String username, PersAccount account, ProcessBean processBean) throws MEDException {
		ResponseBody data = new ResponseBody();
		LoginRsType loginRsType = new LoginRsType();
		loginRsType.setUsername(username);
		loginRsType.setSignature(JWTUtils.sign(username, String.valueOf(account.getPersId())));
		loginRsType.setGroup(account.getTypeEmp() ? "Admin" : "User");
		String nickname = account.getPerson().getPersonCurrent().getPersNickname();
		loginRsType.setName(null == nickname ? "":nickname);
		data.setLoginRs(loginRsType);
		PersonCurrent current = personCurrentDAO.findByPK(account.getPersId());
		String slash = Constants.SYMBOLIC.SLASH;
		String picPath = (current.getPicturePath() == null) ? ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.ROOT_IMAGE_DIRECTORY") + slash + ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.PROFILE_PIC_DIRECTORY") + slash + account.getPersId()
				: ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.ROOT_IMAGE_DIRECTORY") + slash +current.getPicturePath();
		loginRsType.setPersPicturePath(picPath);
		return data;

	}
	

}
