package com.med.ws.controller.endpoint;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.auth0.jwt.JWTVerifyException;
import com.med.common.contants.ConfigMapHelper;
import com.med.common.contants.Constants;
import com.med.common.contants.ErrorConstants;
import com.med.common.utils.DateUtils;
import com.med.common.utils.JWTUtils;
import com.med.ods.dao.ResearchTblDAO;
import com.med.ws.controller.service.ASLService;
import com.med.ws.controller.service.ResearchService;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.response.ExceptionResponse;
import com.med.ws.dto.response.MasterResponse;

@Controller
@Transactional
@RequestMapping(value = "/file")
public class FileService {
	
	@Autowired
	ASLService aslService;
	@Autowired
	ResearchService researchService;
	@Autowired
	ResearchTblDAO researchTblDAO;
	
	public static Logger logger = LogManager.getLogger(FileService.class);
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public @ResponseBody MasterResponse uploadFile(@RequestParam("file") List<MultipartFile> file, HttpServletRequest request) throws IOException, InvalidKeyException, NoSuchAlgorithmException, IllegalStateException, SignatureException, JWTVerifyException {
		ProcessBean processBean = new ProcessBean();
		processBean.setOprid(JWTUtils.authenAndGetPersId(request.getHeader(Constants.JWT.HEADER_NAME)));
		return initialFile(file, request, processBean);

	}
	private MasterResponse initialFile(List<MultipartFile> file, HttpServletRequest request,ProcessBean processBean) {
		String root_dir = ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.FILE_ROOT_DIRECTORY");
		String temp_dir = ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.TEMP_FILE_DIRECTORY");
		String root_file_dir = ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.ROOT_FILE_DIRECTORY");
		String filePath = null;
		String fileName = null;
		String fileType = null;
		if (!file.isEmpty()) {
			try {
				List<String> tempName = new ArrayList<>();
				Integer seq = 0;
				for(MultipartFile f : file){//
					fileType = f.getOriginalFilename().split("\\.")[1];
					fileName = processBean.getOprid() + Constants.SYMBOLIC.UNDERSCORE +DateUtils.yyyyMMddHHmmss.format(Calendar.getInstance().getTime())+ Constants.SYMBOLIC.UNDERSCORE + (seq++) + "."+ fileType;
					filePath =  root_dir + Constants.SYMBOLIC.SLASH + root_file_dir + Constants.SYMBOLIC.SLASH +temp_dir + Constants.SYMBOLIC.SLASH + fileName;
					byte[] bytes = f.getBytes();
					logger.debug(filePath);
					File newFile = new File(filePath);
					BufferedOutputStream buffStream = new BufferedOutputStream(new FileOutputStream(newFile));
					buffStream.write(bytes);
					buffStream.close();
					tempName.add(fileName);
					newFile.exists();
				}
				
				MasterResponse res = new MasterResponse();
				res.setDesc("Test file controller");
				com.med.ws.dto.response.ResponseBody body = new com.med.ws.dto.response.ResponseBody();
				body.setFileUploadName(tempName);
				res.setData(body);
				return res;
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
				String errorDesc = "You failed to upload " + fileName + ": " + e.getMessage();
				Long errorCd = ErrorConstants.UNKNOW_ERROR.getErrorCd();
				ExceptionResponse res = new ExceptionResponse(errorCd, errorDesc);
				return res;
			}
		} else {
			String errorDesc = "Unable to upload. File is empty.";
			Long errorCd = ErrorConstants.UNKNOW_ERROR.getErrorCd();
			ExceptionResponse res = new ExceptionResponse(errorCd, errorDesc);
			return res;
		}
	}
	
	@RequestMapping(value = "/download", method = RequestMethod.GET)
	public @ResponseBody MasterResponse download(@RequestParam("fileName") String fileName, HttpServletRequest request, HttpServletResponse response) throws IOException {
		File file = new File(fileName);
		logger.debug(file.getAbsolutePath());
		FileInputStream in = new FileInputStream(file);
		byte[] content = new byte[(int) file.length()];
		in.read(content);
		ServletContext sc = request.getSession().getServletContext();
		String mimetype = sc.getMimeType(file.getName());
		response.reset();
		response.setContentType(mimetype);
		response.setContentLength(content.length);
		response.setHeader("Content-Disposition", "attachment; filename=\"" + file.getName() + "\"");
		org.springframework.util.FileCopyUtils.copy(content, response.getOutputStream());
		in.close();
		return null;
	}
}
