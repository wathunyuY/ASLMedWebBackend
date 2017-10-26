package com.med.ws.controller.service;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Calendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.auth0.jwt.internal.org.apache.commons.codec.binary.Hex;
import com.med.common.contants.Constants;
import com.med.common.utils.PasswordEncryptionUtils;
import com.med.ods.dao.PersAccountDAO;
import com.med.ods.dao.PersonCurrentDAO;
import com.med.ods.entity.PersAccount;
import com.med.ods.entity.Person;

@Service
@Transactional
public class AccountService {
	private static Logger logger = LogManager.getLogger(AccountService.class);

	@Autowired
	PersAccountDAO persAccountDAO;
	@Autowired
	PersonCurrentDAO personCurrentDAO;

	private void createAccount(String username, String password, Person pers, Integer lastUpdOprid, Boolean isEmp,
			Boolean isAccept) throws NoSuchAlgorithmException, InvalidKeySpecException {
		createAccount(username, password, pers, lastUpdOprid, isEmp, isAccept, null);
	}

	private void createAccount(String username, String password, Person pers, Integer lastUpdOprid, Boolean isEmp,
			Boolean isAccept, String fow) throws NoSuchAlgorithmException, InvalidKeySpecException {
		byte[] saltByte = PasswordEncryptionUtils.generateSalt();
		String salt = Hex.encodeHexString(saltByte);
		String pwdEncrypted = Hex.encodeHexString(PasswordEncryptionUtils.getEncryptedPassword(password, saltByte));

		PersAccount account = new PersAccount();
		account.setUsername(username);
		account.setPerson(pers);
		account.setLastUpdOprid(lastUpdOprid);
		account.setSalt(salt);
		account.setPassword(pwdEncrypted);
		account.setLastUpdDttm(Calendar.getInstance().getTime());
		account.setPerson(pers);
		account.setTypeEmp(isEmp);
		account.setChatAccept(isAccept);
		account.setEmpFow(fow);
		persAccountDAO.persist(account);

	}

	public void createStudentAccount(String nid, String stdCd, Person p, Integer lastUpdOprid) throws Exception {
		String password = nid.substring(nid.length() - 6);
		try {
			createAccount(stdCd, password, p, lastUpdOprid, false, true);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	public void createEmpAccount(String nid, String username, Person p, Integer lastUpdOprid, String fieldOfWork)
			throws Exception {
		String password = nid.substring(nid.length() - 6);
		try {
			createAccount(username, password, p, lastUpdOprid, true, false, fieldOfWork);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}
	
	public void updateAcceptChatrooLaw(Boolean status,Integer oprId){
		try {
			PersAccount ac = persAccountDAO.findByPK(oprId);
			ac.setChatAccept(status);
			persAccountDAO.merge(ac);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}
	public Boolean getAcceptChatrooLaw(Integer oprId){
		try {
			PersAccount ac = persAccountDAO.findByPK(oprId);
			return null != ac.getChatAccept() ? ac.getChatAccept() : false;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}
}
