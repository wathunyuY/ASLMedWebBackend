package com.med.ws.controller.service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.med.common.contants.Constants;
import com.med.ods.dao.TxnLogDAO;
import com.med.ods.entity.TxnLog;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.type.rs.LoginRsType;

@Service
@Transactional
public class LogService {
	@Autowired
	TxnLogDAO txnLogDAO;
	@Autowired
	ASLService aslService;

	public TxnLog initTxnLog(ProcessBean processBean) {
		TxnLog txnLog = processBean.getTxnLog();
		ObjectMapper mapper = new ObjectMapper();
		byte[] jsonByte = null;
		try {
			if (processBean.getRequest() != null) {
				jsonByte = mapper.writeValueAsBytes(processBean.getRequest());
				File temp = File.createTempFile("REQ", ".json");
				byte[] fileByte = zipBytes(temp.getName(), jsonByte);
				txnLog.setRequest(fileByte);
				temp.delete();
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		txnLog.setRequestOprid(processBean.getOprid() != null ? Integer.parseInt(processBean.getOprid()) : null);
		
		return txnLog;
	}

	public byte[] zipBytes(String filename, byte[] input) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ZipOutputStream zos = new ZipOutputStream(baos);
		ZipEntry entry = new ZipEntry(filename);
		entry.setSize(input.length);
		zos.putNextEntry(entry);
		zos.write(input);
		zos.closeEntry();
		zos.close();
		return baos.toByteArray();
	}

	public void saveTxnLog(ProcessBean processBean) {
		TxnLog log = processBean.getTxnLog();

		ObjectMapper mapper = new ObjectMapper();
		byte[] jsonByte = null;
		try {
			if (processBean.getResponse() != null) {
				jsonByte = mapper.writeValueAsBytes(processBean.getResponse());
				File temp = File.createTempFile("RES", ".json");
				byte[] fileByte = zipBytes(temp.getName(), jsonByte);
				log.setResponse(fileByte);
				temp.delete();
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		txnLogDAO.persist(log);
	}
	
}
