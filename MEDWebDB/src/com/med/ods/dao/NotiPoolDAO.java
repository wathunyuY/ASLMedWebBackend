package com.med.ods.dao;

import java.io.Serializable;
import java.util.List;

import com.med.ods.entity.NotiPool;

public interface NotiPoolDAO extends GenericDAO<NotiPool, Serializable>{
	public List<NotiPool> findTaskByOwner(Integer persId);
	public List<NotiPool> findByOwner(Integer persId);
	public List<NotiPool> findByTargetAndTypeList(String target, List<String> types);
	public List<NotiPool> findBySentAndTypeList(Boolean sent, List<String> types);
	public List<NotiPool> findChatByTopic(String topic);
}
