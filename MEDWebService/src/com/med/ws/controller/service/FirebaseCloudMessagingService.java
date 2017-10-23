package com.med.ws.controller.service;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.med.common.contants.Constants;
import com.med.common.contants.ErrorConstants;
import com.med.common.contants.NotificationTypeConstants;
import com.med.common.exception.MEDException;
import com.med.ods.dao.NotiSubscrPersonDAO;
import com.med.ods.dao.NotiSubscrTblDAO;
import com.med.ods.dao.PersLoginDeviceDAO;
import com.med.ods.dao.PersonDAO;
import com.med.ods.entity.NotiSubscrPerson;
import com.med.ods.entity.NotiSubscrPersonId;
import com.med.ods.entity.NotiSubscrTbl;
import com.med.ods.entity.PersLoginDevice;
import com.med.ods.entity.Person;
import com.med.ws.controller.workflow.master.ProcessBean;

/**
 * @author Teerapan V.
 */
@Service
@Transactional
public class FirebaseCloudMessagingService {

	@Autowired
	PersLoginDeviceDAO persLoginDeviceDAO;
	@Autowired
	PersonDAO personDAO;
//	@Autowired
//	ScheduleTopicDAO scheduleTopicDAO;
//	@Autowired
//	CalendarTblDAO calendarTblDAO;
//	@Autowired
//	PersonalService personalService;
//	@Autowired
//	EmpInfoDAO empInfoDAO;
//	@Autowired
//	StdntInfoDAO stdntInfoDAO;
//	@Autowired
//	SectionStdntDAO sectionStdntDAO;
//	@Autowired
//	ScheduleTopicTeacherDAO scheduleTopicTeacherDAO;
	@Autowired
	BroadcastService broadcastService;
	@Autowired
	NotificationService notiService;
	@Autowired
	NotiSubscrTblDAO notiSubscrTblDAO;
	@Autowired
	NotiSubscrPersonDAO notiSubscrPersonDAO;

	private static Logger logger = LogManager.getLogger(FirebaseCloudMessagingService.class);

	private static final String SERVER_KEY = "key=" + Constants.FIREBASE.SERVER_KEY;
	private static final String FCM_APIS = "https://fcm.googleapis.com/fcm/";
	private static final String IID_APIS = " https://iid.googleapis.com/iid/";
	private static final String API_VERSION = "v1";

	/**
	 * @author Teerapan V.
	 * @throws MEDException
	 */
	public JsonObject retrieveRegistokenDetail(String token) throws MEDException { // ติดตามกลุ่ม by token
		Gson gson = new Gson();
		JsonObject jsonResult = new JsonObject();
		if (StringUtils.isEmpty(token))
			return null;
		try {
			URL url = new URL(IID_APIS + "info/" + token + "?details=true");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestProperty("Authorization", SERVER_KEY);
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			if (404 == conn.getResponseCode()) {
				logger.error("HTTP 404: Can't Retrieve Registration Token Detail, [" + token + "]");
				deleteFcmToken(token);
				return null;
				// throw new MEDException(ErrorConstants.FCM_TOKEN_NOT_FOUND,
				// token);
			}
			if (200 == conn.getResponseCode()) {
				InputStream in = new BufferedInputStream(conn.getInputStream());
				String result = org.apache.commons.io.IOUtils.toString(in, "UTF-8");
				logger.debug(result);
				jsonResult = gson.fromJson(result, JsonObject.class);
			}
			conn.disconnect();
		} catch (IOException io) {
			logger.error(io.getMessage(), io);
			throw new MEDException(ErrorConstants.UNKNOW_HTTP_ERROR);
		}
		return jsonResult;
	}

	/**
	 * @author Teerapan V.
	 * @throws MEDException
	 */
	public void saveDeviceToken(String token, Integer oprid) throws MEDException, ParseException { //Map deveice with token
		if (!StringUtils.isEmpty(token)) {
			logger.debug(token);
			Person person = personDAO.findByPK(oprid);
			PersLoginDevice device = persLoginDeviceDAO.findByRegisTokenAndUser(token, oprid);
			PersLoginDevice old_device = persLoginDeviceDAO.findByRegisTokenOrderByLastUpdttm(token);
			if (null == device) {
				JsonObject json = retrieveRegistokenDetail(token);
				if (null != json) {
					Set<String> keys = json.entrySet().stream().map((o) -> o.getKey()).collect(Collectors.toSet());
					try {
						device = new PersLoginDevice(person);
						device.setRegisToken(token);
						if (keys.contains("platform"))
							device.setPlatform(json.get("platform").getAsString());
						if (keys.contains("connectDate"))
							device.setConnectDate(
									new SimpleDateFormat("yyyy-MM-dd").parse(json.get("connectDate").getAsString()));
						if (keys.contains("connectionType"))
							device.setConnectionType(json.get("connectionType").getAsString());
						device.setLastUpdDttm(Calendar.getInstance().getTime());
						device.setLastUpdOprid(oprid);
						device.setAcceptFlag(Constants.MSSQL.LOGIC.FALSE);
						persLoginDeviceDAO.merge(device);
					} catch (Exception e) {
						logger.error(e.getMessage(), e);
					}

				}
			}
			if (null != old_device) {
				if (old_device.getPerson() != device.getPerson()) {
					persLoginDeviceDAO.delete(old_device);
				}
			}
		}
	}

	/**
	 * @author Teerapan V.
	 */
	public List<String> retrieveTopicList(String userToken) throws MEDException { // ดึงห้องที่ ติดตาม by token
		JsonObject response = retrieveRegistokenDetail(userToken);
		List<String> result = new ArrayList<>();
		if (null != response) {
			if(null == response.get("rel")) return result;
			JsonObject rel = response.get("rel").getAsJsonObject();
			JsonObject topics = rel.get("topics").getAsJsonObject();
			result = topics.entrySet().stream().map(i -> "/topics/".concat(i.getKey())).collect(Collectors.toList());
		}
		return result;
	}

	/**
	 * @author Teerapan V.
	 * @param {string}
	 *            topic - Subscribe Topic
	 * @param {string}
	 *            userToken - Firebase Instance ID Token
	 */
	public JsonObject userSubscribe(String topic, String userToken) {
		Gson gson = new Gson();
		JsonObject jsonResult = new JsonObject();

		if (StringUtils.isEmpty(userToken) || StringUtils.isEmpty(topic))
			return null;

		try {
			URL url = new URL(IID_APIS + API_VERSION + Constants.SYMBOLIC.SLASH + userToken + "/rel" + topic);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Authorization", SERVER_KEY);
			conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			// conn.setRequestProperty("Content-Length", "0");
			conn.setDoOutput(true);
			OutputStream os = conn.getOutputStream();
			String msgBody = gson.toJson(null);
			os.write(msgBody.toString().getBytes("UTF-8"));
			os.close();

			if (200 != conn.getResponseCode()) {
				logger.error(conn.getInputStream().toString());
				// throw new MEDException(ErrorConstants.UNKNOW_HTTP_ERROR);
			}

			if (200 == conn.getResponseCode()) {
				// Read the response
				InputStream in = new BufferedInputStream(conn.getInputStream());
				// String result = org.apache.commons.io.IOUtils.toString(in,
				// "UTF-8");
				// logger.debug(result);
				// jsonResult = gson.fromJson(result, JsonObject.class);
				in.close();

				List<String> tokens = new ArrayList<>();
				tokens.add(userToken);
				addSubscriberFromDatabase(topic, tokens, null);

			}
			conn.disconnect();
		} catch (IOException io) {
			logger.info("SUBSCRIBE Problem: Cannot user token to Subscribe [" + userToken + "]");
			logger.error(io.getMessage());
			// throw new MEDException(ErrorConstants.UNKNOW_HTTP_ERROR);
			return null;
		}
		return jsonResult;
	}

	/**
	 * @author Teerapan V.
	 * @param {list<string>}
	 *            tokenList - List of Devices Token
	 * @param {string}
	 *            topic - String contains '/topics/.....'
	 */
	public JsonObject userSubscribe(String topic, List<String> tokenList) {
		Gson gson = new Gson();
		JsonObject jsonResult = new JsonObject();

		if (CollectionUtils.isEmpty(tokenList) || StringUtils.isEmpty(topic))
			return null;

		try {
			URL url = new URL(IID_APIS + API_VERSION + Constants.SYMBOLIC.COLON + "batchAdd");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Authorization", SERVER_KEY);
			// conn.setRequestProperty("Content-Type", "application/json;
			// charset=UTF-8");
			// conn.setRequestProperty("Content-Length", "0");
			conn.setDoOutput(true);
			OutputStream os = conn.getOutputStream();
			JsonObject body = new JsonObject();
			body.addProperty("to", topic);
			JsonArray jsonTokens = new JsonArray();
			tokenList.stream().forEach(o -> jsonTokens.add(o));
			body.add("registration_tokens", jsonTokens);
			String msgBody = gson.toJson(body);
			logger.debug("Request Body: " + msgBody);
			os.write(msgBody.toString().getBytes("UTF-8"));
			os.close();

			if (200 != conn.getResponseCode()) {
				logger.error(conn.getInputStream().toString());
				// throw new MEDException(ErrorConstants.UNKNOW_HTTP_ERROR);
			}

			if (200 == conn.getResponseCode()) {
				// Read the response
				InputStream in = new BufferedInputStream(conn.getInputStream());
				String result = org.apache.commons.io.IOUtils.toString(in, "UTF-8");
				logger.debug(result);
				jsonResult = gson.fromJson(result, JsonObject.class);
				JsonArray results = jsonResult.getAsJsonArray("results");
				in.close();
				addSubscriberFromDatabase(topic, tokenList, results);
			}
			conn.disconnect();

		} catch (IOException io) {
			logger.info("SUBSCRIBE Problem: bulk subscribe topic [" + topic + "]");
			logger.error(io.getMessage());
			// throw new MEDException(ErrorConstants.UNKNOW_HTTP_ERROR);
			return null;
		}
		return jsonResult;
	}

	/**
	 * @author Teerapan V.
	 * @param {string}
	 *            topic - Subscribe Topic
	 * @param {string}
	 *            userToken - Firebase Instance ID Token
	 */
	public JsonObject userUnsubscribe(String topic, String userToken) {
		JsonObject jsonResult = new JsonObject();
		if (StringUtils.isEmpty(userToken) || StringUtils.isEmpty(topic)) {
			return null;
		}
		try {
			URL url = new URL(IID_APIS + API_VERSION + Constants.SYMBOLIC.SLASH + userToken + "/rel" + topic);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("DELETE");
			conn.setRequestProperty("Authorization", SERVER_KEY);
			conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			conn.setDoOutput(true);
			// OutputStream os = conn.getOutputStream();
			// String msgBody = gson.toJson(body);
			// os.write(msgBody.toString().getBytes("UTF-8"));
			// os.close();
			if (conn.getResponseCode() != 200) {
				logger.info(conn.getInputStream().toString());
				// throw new MEDException(ErrorConstants.UNKNOW_HTTP_ERROR);
			}
			if (conn.getResponseCode() == 200) {
				logger.info("UNSUBCRIBE: " + topic);
				// Read the response
				InputStream in = new BufferedInputStream(conn.getInputStream());
				// String result = org.apache.commons.io.IOUtils.toString(in,
				// "UTF-8");
				// logger.debug(result);
				// jsonResult = gson.fromJson(result, JsonObject.class);
				in.close();
				
				List<String> tokens = new ArrayList<>();
				tokens.add(userToken);
				removeSubscriberFromDatabase(topic, tokens);

			}
			conn.disconnect();
		} catch (IOException io) {
			logger.info("SUBSCRIBE Problem: Cannot user token to Subscribe [" + userToken + "]");
			logger.error(io.getMessage());
			// throw new MEDException(ErrorConstants.UNKNOW_HTTP_ERROR);
		}
		return jsonResult;
	}

	/**
	 * @author Teerapan V.
	 * @throws MEDException
	 */
	public void deleteDeviceToken(ProcessBean pb) {
		String token = pb.getRequest().getFcmTokenRqType().getFcmToken();
		Integer oprid = Integer.parseInt(pb.getOprid());
		if (!StringUtils.isEmpty(token)) {
			deleteFcmTokenByPersAndToken(token, oprid);
		}
	}

	/**
	 * @author Teerapan V.
	 */
	public void loginSubscribeOrderFromServer(ProcessBean pb) throws MEDException {
		Integer oprid = Integer.parseInt(pb.getOprid());
		String token = pb.getRequest().getFcmTokenRqType().getFcmToken();
		// if (StringUtils.isEmpty(token))
		// throw new MEDException(ErrorConstants.MISSING_REQUIRED_FIELDS_PARAMS,
		// "FCM_REGIS_TOKEN");
		if (pb.getIsAppReq()) {
			List<String> topicsList = broadcastService.getSubscribeTopics(oprid);
			for (String topic : topicsList) {
				userSubscribe(topic, token);
			}
		}
	}

	/**
	 * @author Teerapan V.
	 */
	public void logoutUnsubscribeOrderFromService(ProcessBean pb) throws MEDException {
		String token = pb.getRequest().getFcmTokenRqType().getFcmToken();
		// if (StringUtils.isEmpty(token))
		// throw new MEDException(ErrorConstants.MISSING_REQUIRED_FIELDS_PARAMS,
		// "FCM_REGIS_TOKEN");
//		if (pb.getIsAppReq()) {
			for (String topic : retrieveTopicList(token)) {
				// /topics/{{topic_name}}
				userUnsubscribe(topic, token);
			}
//		}
	}

	/**
	 * @author Teerapan V.
	 * @throws MEDException
	 */
	public JsonObject bulkUnsubscribe(String topic, List<String> tokens) throws MEDException {
		Gson gson = new Gson();
		JsonObject jsonResult = new JsonObject();
		try {
			URL url = new URL(IID_APIS + API_VERSION + ":batchRemove");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Authorization", SERVER_KEY);
			conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			// conn.setRequestProperty("Content-Length", "0");
			conn.setDoOutput(true);
			OutputStream os = conn.getOutputStream();

			JsonObject json = new JsonObject();
			json.addProperty("to", topic);
			JsonArray array = new JsonArray();
			tokens.stream().forEach(i -> array.add(i));
			json.add("registration_tokens", array);

			String msgBody = gson.toJson(json);
			os.write(msgBody.toString().getBytes("UTF-8"));
			os.close();

			if (conn.getResponseCode() != 200) {
				logger.error(conn.getInputStream().toString());
				throw new MEDException(ErrorConstants.UNKNOW_HTTP_ERROR);
			}

			// Read the response
			InputStream in = new BufferedInputStream(conn.getInputStream());
			String result = org.apache.commons.io.IOUtils.toString(in, "UTF-8");
			logger.debug(result);
			jsonResult = gson.fromJson(result, JsonObject.class);
			in.close();
			conn.disconnect();

		} catch (IOException e) {
			logger.error(e.getMessage(), e);
			throw new MEDException(ErrorConstants.UNKNOW_HTTP_ERROR);
		}
		return jsonResult;
	}

	private void addSubscriberFromDatabase(String topic, List<String> tokens, JsonArray results) {
		// Save Subscriber action
		Date now = Calendar.getInstance().getTime();
		NotiSubscrTbl subscr_topic = notiSubscrTblDAO.findByPK(Integer.parseInt(topic.split("-")[1])); ///topics/chatroom-%d-dev
		if (null == subscr_topic) {
			subscr_topic = new NotiSubscrTbl();
			subscr_topic.setIsActive(true ? 1 : 0);
			subscr_topic.setSubscrId(Integer.parseInt(topic)); // FIXME int to str
			NotificationTypeConstants type = defineSubscribeTopicType(topic);
			if (null != type)
				subscr_topic.setType(type.getCode());
			subscr_topic.setLastUpdDttm(now);
			notiSubscrTblDAO.persist(subscr_topic);
		}
		for (int i = 0; i < tokens.size(); i++) {
			String token = tokens.get(i);
			Boolean isSuccess = false;
			if (results != null) {
				JsonObject result = results.get(i).getAsJsonObject();
				if (null == result.get("error"))
					isSuccess = true;
				else
					isSuccess = false;
			}
			PersLoginDevice device = persLoginDeviceDAO.findByRegisTokenOrderByLastUpdttm(token);
			if (null != device) {
				NotiSubscrPerson subscr_pers = new NotiSubscrPerson();
				NotiSubscrPersonId subscr_pers_pk = new NotiSubscrPersonId();
				subscr_pers_pk.setPersLoginDevice(device.getPersLoginDevice());
				subscr_pers_pk.setSubscrId(subscr_topic.getSubscrId());
				subscr_pers.setId(subscr_pers_pk);
				if (isSuccess)
					subscr_pers.setStatus("SUCCESS");
				else
					subscr_pers.setStatus("FAIL");
				subscr_pers.setLastUpdDttm(now);
				notiSubscrPersonDAO.merge(subscr_pers);
			}
		}
	}

	private void removeSubscriberFromDatabase(String topic, List<String> tokens) {
		for (String token: tokens){
			PersLoginDevice device = persLoginDeviceDAO.findByRegisTokenOrderByLastUpdttm(token);
			if (null != device){
				NotiSubscrPerson sub_pers = notiSubscrPersonDAO.findByPK(new NotiSubscrPersonId(Integer.parseInt(topic), device.getPersLoginDevice())); //FIXME int to str
				if (null != sub_pers)
					notiSubscrPersonDAO.delete(sub_pers);
			}
		}
	}

	private NotificationTypeConstants defineSubscribeTopicType(String topic) {
		if (topic.contains("chat"))
			return NotificationTypeConstants.CHAT;
		return null;
	}

	private void deleteFcmTokenByPersAndToken(String token, Integer persId) {
		PersLoginDevice device = persLoginDeviceDAO.findByRegisTokenAndUser(token, persId);
		if (null != device) {
			for(NotiSubscrPerson np : device.getNotiSubscrPersons())
				notiSubscrPersonDAO.delete(np);
			persLoginDeviceDAO.delete(device);
			logger.info("Removed Token: "+token+" of PERS_ID ["+persId+"]");
		}
	}

	private void deleteFcmToken(String token) {
		PersLoginDevice device = persLoginDeviceDAO.findByRegisTokenOrderByLastUpdttm(token);
		if (null != device) {
			persLoginDeviceDAO.delete(device);
			logger.info("Removed Token: "+token);
		}
	}

}
