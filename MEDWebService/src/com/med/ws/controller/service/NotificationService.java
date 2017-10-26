package com.med.ws.controller.service;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.MulticastResult;
import com.google.android.gcm.server.Notification;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;
import com.google.gson.Gson;
import com.med.asl.ws.beans.NotificationDataParamBean;
import com.med.common.contants.Constants;
import com.med.common.contants.ErrorConstants;
import com.med.common.contants.NotificationTypeConstants;
import com.med.common.exception.MEDException;
import com.med.common.utils.BeanUtils;
import com.med.common.utils.StringUtils;
import com.med.ods.dao.NotiAttributeDAO;
import com.med.ods.dao.NotiLogDAO;
import com.med.ods.dao.NotiPoolDAO;
import com.med.ods.dao.NotiSubscrPersonDAO;
import com.med.ods.dao.NotiSubscrTblDAO;
import com.med.ods.dao.PersLoginDeviceDAO;
import com.med.ods.dao.PersonDAO;
import com.med.ods.entity.NotiAttribute;
import com.med.ods.entity.NotiAttributeId;
import com.med.ods.entity.NotiLog;
import com.med.ods.entity.NotiLogId;
import com.med.ods.entity.NotiPool;
import com.med.ods.entity.NotiSubscrTbl;
import com.med.ods.entity.PersLoginDevice;
import com.med.ods.entity.Person;
import com.med.ws.dto.rs.NotificationLogType;
import com.med.ws.noti.config.TaskMessageBean;

@Service
@Transactional
public class NotificationService {

//	@Autowired
//	TransTaskDAO transTaskDAO;
	@Autowired
	PersonDAO personDAO;
	@Autowired
	PersLoginDeviceDAO persLoginDeviceDAO;
	@Autowired
	NotiPoolDAO notiPoolDAO;
	@Autowired
	NotiLogDAO notiLogDAO;
	@Autowired
	NotiAttributeDAO notiAttributeDAO;
	@Autowired
	NotiSubscrTblDAO notiSubscrTblDAO;
	@Autowired
	NotiSubscrPersonDAO subscrPersonDAO;
	
	private static Logger logger = LogManager.getLogger(NotificationService.class);

	public List<TaskMessageBean> findTaskNotiByPersId(Integer persId) throws MEDException {
		List<TaskMessageBean> result = new ArrayList<>();
		List<NotiPool> tasks = notiPoolDAO.findTaskByOwner(persId);
		if (null != tasks) {
			for (NotiPool noti : tasks) {
				TaskMessageBean msg = this.buildTaskMessageBean(noti, persId);
				result.add(msg);
			}
			logger.debug("USER #" + persId + ", Refresh Task List(s): " + result.size());
		}
		return result;
	}

	private TaskMessageBean buildTaskMessageBean(NotiPool noti, Integer persId) throws MEDException {
		TaskMessageBean msg = new TaskMessageBean(noti.getNotiId(), noti.getPersonOwner(), noti.getCreatedAt(),
				NotificationTypeConstants.TASK);
		NotiLog log = notiLogDAO.findByPK(new NotiLogId(persId, noti.getNotiId()));
		msg.setRead(log.getRead());
		if (noti.getType().equals(NotificationTypeConstants.TASK.getCode())) {
//			NotificationDataParamBean parm = this.buildNotificationDataParamBean(noti);
//			TransTask task = transTaskDAO.findByPK(parm.getTaskId());
//			if (null == task){
//				logger.error("Can't find TASK_ID: "+parm.getTaskId());
//				return null;
//			}
//			TaskBean taskBean = new TaskBean();
//			taskBean.setTaskId(task.getTransTaskId());
//			taskBean.setTaskConstant(transTaskDAO.findTaskConstantByTransTask(task).getTaskId());
//			taskBean.setDescr(task.getDescr());
//			taskBean.setStatus(task.getStatusCd());
//			msg.setTask(taskBean);
//			msg.setTitle(noti.getTitle()); FIXME uncomment
		}
		return msg;
	}

	public void readNotification(String nid, Integer oprid) throws MEDException {
		// NotificationEntity noti = notiRepository.findOne(nid);
		// noti.setRead(true);
		// noti.setLastUpdDttm(Calendar.getInstance().getTime());
		// notiRepository.save(noti);
		Integer notiid = Integer.parseInt(nid);
		NotiLog noti = notiLogDAO.findByPK(new NotiLogId(oprid, notiid));
		noti.setRead(true);
		notiLogDAO.merge(noti);
	}

	/**
	 * Use to send notification to target by Firebase
	 * 
	 * @author Teerapan V.
	 * @throws MEDException
	 * @param {int}:
	 *            owner - sender of the notification
	 * @param {string}
	 *            target - can either be Integer (persId) or String contains '/topics' or Single FCM Registration Token
	 * @param {string}
	 *            notibody - body message and detail of the notification
	 * @param {enum}
	 *            type - type of Notification
	 * @param {NotificationDataParamBean}
	 *            detail - parameter of the notification
	 */
	public void notify(Integer owner, String target, String notibody, NotificationTypeConstants type,
			NotificationDataParamBean detail) throws MEDException {

		Sender sender = new Sender(Constants.FIREBASE.SERVER_KEY);
		try {
			String dataJson = new Gson().toJson(detail);
			Notification.Builder noti_bd = new Notification.Builder("myicon");
			noti_bd.title(type.getDefaultTitle()); // NOTE: Title from Type Enum
			noti_bd.body(notibody);

			Message.Builder msg_bd = new Message.Builder();
			msg_bd.priority(Message.Priority.HIGH);
			msg_bd.notification(noti_bd.build());
			msg_bd.addData("type", type.getCode());
			msg_bd.addData("detail", dataJson);
			Message fcm_msg = msg_bd.build();

			saveFcmNoti(owner, target, true, null, notibody, type, detail);

			if (target.contains("/topics")) {
				Result result = sender.sendNoRetry(fcm_msg, target);
				if (null != result.getFailure() && result.getFailure() > 0)
					logger.info("Send failed: " + result.getFailure());
			} else if(StringUtils.isNumeric(target)){
				Person per = personDAO.findByPK(Integer.parseInt(target));
				Set<PersLoginDevice> devices = per.getPersLoginDevices();
				List<String> tokenList = new ArrayList<>();
				for (PersLoginDevice device : devices) {
					tokenList.add(device.getRegisToken());
				}
				if (!CollectionUtils.isEmpty(tokenList) || tokenList.size() > 0) {
					MulticastResult result = sender.sendNoRetry(fcm_msg, tokenList);
					if (result.getFailure() > 0)
						logger.info("Send failed: " + result.getFailure() + "/" + tokenList.size());
				}
			} else{
				
			}
		} catch (NullPointerException nu) {
			logger.error(nu.getMessage(), nu);
			throw new MEDException(ErrorConstants.FCM_TOKEN_NOT_FOUND, target);
		} catch (IOException io) {
			logger.error(io.getMessage(), io);
			throw new MEDException(ErrorConstants.UNKNOW_HTTP_ERROR);
		}
	}

	/**
	 * @author Teerapan V.
	 * @throws MEDException
	 */
	public void notify(NotiPool noti) throws MEDException {
		Sender sender = new Sender(Constants.FIREBASE.SERVER_KEY);
		try {
			Notification.Builder noti_bd = new Notification.Builder("myicon");
			noti_bd.title(noti.getTitle());
			noti_bd.body(noti.getBody());

			String json = new Gson().toJson(this.buildNotificationDataParamBean(noti));
			Message.Builder msg_bd = new Message.Builder();
			msg_bd.priority(Message.Priority.HIGH);
			msg_bd.notification(noti_bd.build());
			msg_bd.addData("type", noti.getType());
			msg_bd.addData("detail", json);
			Message fcm_msg = msg_bd.build();

			if (noti.getTarget().contains("/topics")) {
				Result result = sender.sendNoRetry(fcm_msg, noti.getTarget());
				noti.setSent(true);
				notiPoolDAO.merge(noti);
				if (null != result.getFailure() && result.getFailure() > 0)
					logger.info("Send failed: " + result.getFailure());
			} else {
				Person per = personDAO.findByPK(Integer.parseInt(noti.getTarget()));
				Set<PersLoginDevice> devices = per.getPersLoginDevices();
				List<String> tokenList = new ArrayList<>();
				for (PersLoginDevice device : devices) {
					noti.setSent(true);
					notiPoolDAO.merge(noti);
					tokenList.add(device.getRegisToken());
				}
				if (!CollectionUtils.isEmpty(tokenList) || tokenList.size() > 0) {
					logger.debug(tokenList.size());
					MulticastResult result = sender.sendNoRetry(fcm_msg, tokenList);
					if (result.getFailure() > 0)
						logger.info("Send failed: " + result.getFailure());
				}
			}
		} catch (NullPointerException nu) {
			logger.error(nu.getMessage(), nu);
			throw new MEDException(ErrorConstants.FCM_TOKEN_NOT_FOUND, noti.getTarget());
		} catch (IOException io) {
			logger.error(io.getMessage(), io);
			throw new MEDException(ErrorConstants.UNKNOW_HTTP_ERROR);
		}
	}

	/**
	 * @author Teerapan V.
	 */
	public NotiPool saveFcmNoti(Integer owner, String target, Boolean sent, String title, String body,
			NotificationTypeConstants type, NotificationDataParamBean data) {
		Date now = Calendar.getInstance().getTime();

		NotiPool noti = new NotiPool();
		noti.setSent(sent);
		noti.setBody(body);
		noti.setPersonOwner(owner);
		noti.setTarget(target);
		noti.setCreatedAt(now);
		noti.setLastUpdDttm(now);
		if (StringUtils.isEmpty(title))
			noti.setTitle(type.getDefaultTitle());
		else
			noti.setTitle(title);
		noti.setType(type.getCode());
		notiPoolDAO.persist(noti);

		Map<String, Object> dataDict = new HashMap<>();
		try {
			dataDict = BeanUtils.inspectBean(data);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			dataDict = null;
		}

		for (Entry<String, Object> key : dataDict.entrySet()) {
			if (!ObjectUtils.isEmpty(key.getValue())) {
				NotiAttribute attribute = new NotiAttribute();
				NotiAttributeId attr_pk = new NotiAttributeId();
				attr_pk.setNotiId(noti.getNotiId());
				attr_pk.setKey(key.getKey());
				attribute.setId(attr_pk);
				attribute.setNotiPool(noti);
				attribute.setValue(key.getValue().toString());
				notiAttributeDAO.persist(attribute);
			}
		}

		if (target.contains("/topics")) {
			Integer subscrId = Integer.parseInt(target.split("-")[1]);
			logger.info(subscrId);
			NotiSubscrTbl subid = notiSubscrTblDAO.findByPK(subscrId);
			if (null != subid){
				for(Person per: subscrPersonDAO.findPersonBySubscrId(subscrId)){//findPersonBySubId
					NotiLog log = new NotiLog();
					NotiLogId log_pk = new NotiLogId();
					log_pk.setNotiId(noti.getNotiId());
					log_pk.setPersId(per.getPersId());
					log.setId(log_pk);
					if (per.getPersId() != owner)
						log.setRead(false);
					else
						log.setRead(true);
					notiLogDAO.merge(log);
				}
			}
		} else {
			NotiLog log = new NotiLog();
			NotiLogId log_pk = new NotiLogId();
			log_pk.setNotiId(noti.getNotiId());
			log_pk.setPersId(Integer.parseInt(target));
			log.setId(log_pk);
			log.setRead(false);
			notiLogDAO.merge(log);
		}
		return noti;
	}

	/**
	 * @author Teerapan V.
	 */
	public NotificationDataParamBean buildNotificationDataParamBean(NotiPool noti) {
		NotificationDataParamBean bean = new NotificationDataParamBean();
		Map<String, Object> data = buildAttributeDict(noti);
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			for (PropertyDescriptor propertyDesc : beanInfo.getPropertyDescriptors()) {
				String varName = propertyDesc.getName();
				bean = (NotificationDataParamBean) BeanUtils.dynamicSetter(varName, data.get(varName), bean);
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return null;
		}
		return bean;
	}

	/**
	 * @author Teerapan V.
	 */
	private Map<String, Object> buildAttributeDict(NotiPool noti) {
		Map<String, Object> result = new HashMap<String, Object>();
		if (null != noti.getNotiAttributes()) {
			for (NotiAttribute attr : noti.getNotiAttributes()) {
				Object value;
				if (attr.getId().getKey().equals("empCode") || attr.getId().getKey().equals("classSection"))
					value = attr.getValue();
//				else if (StringUtils.isNumeric(attr.getValue()))
//					value = Integer.parseInt(attr.getValue());
				else
					value = attr.getValue();
				result.put(attr.getId().getKey(), value);
			}
		}
		return result;
	}

	/**
	 * @author Teerapan V.
	 */
	public void bulkSendNotificationByCronjob() throws MEDException {
		List<String> typeList = new ArrayList<>();
		typeList.add(NotificationTypeConstants.EVALUATION.getCode());
		typeList.add(NotificationTypeConstants.SCHEDULE_TRANSFER.getCode());
		List<NotiPool> unsendNotiList = notiPoolDAO.findBySentAndTypeList(false, typeList);
		if (!CollectionUtils.isEmpty(unsendNotiList)) {
			logger.debug("Bulk Sent(s); " + unsendNotiList.size());
			for (NotiPool noti : unsendNotiList) {
				notify(noti);
			}
		}
	}

	/**
	 * @author Teerapan V.
	 */
	public List<NotificationLogType> findTodoNotiByPersId(Integer persId) {
		List<NotificationLogType> result = new ArrayList<>();
		List<String> types = new ArrayList<>();
		types.add(NotificationTypeConstants.SCHEDULE_TRANSFER.getCode());
		types.add(NotificationTypeConstants.EVALUATION.getCode());
		types.add(NotificationTypeConstants.EVALUATION_REPORT.getCode());
		types.add(NotificationTypeConstants.EVALUATION_REJECTED.getCode());
		types.add(NotificationTypeConstants.REPORT_REJECTED.getCode());
		types.add(NotificationTypeConstants.APPLICATIONFORM.getCode());
		types.add(NotificationTypeConstants.ANNOUNCEMENT.getCode());
		List<NotiPool> notis = notiPoolDAO.findByTargetAndTypeList(persId.toString(), types);
		for (NotiPool noti : notis) {
			result.add(buildNotificationLogType(noti, persId));
		}
		return result;
	}

	/**
	 * @author Teerapan V.
	 */
	private NotificationLogType buildNotificationLogType(NotiPool noti, Integer persId) {
		NotificationLogType bean = new NotificationLogType();
		bean.setId(noti.getNotiId());
		bean.setOwner(noti.getPersonOwner());
		NotiLog log = notiLogDAO.findByPK(new NotiLogId(persId, noti.getNotiId()));
		bean.setRead(log.getRead());
		bean.setType(noti.getType());
		bean.setNotificationBody(noti.getBody());
		bean.setNotificationTitle(noti.getTitle());
		bean.setCreated_at(noti.getCreatedAt());
		NotificationDataParamBean parm = this.buildNotificationDataParamBean(noti);
		bean.setDataDetail(parm);
		return bean;
	}
}
