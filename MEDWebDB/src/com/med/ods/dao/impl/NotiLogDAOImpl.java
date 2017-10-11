package com.med.ods.dao.impl;

import org.springframework.stereotype.Repository;

import com.med.ods.dao.NotiLogDAO;
import com.med.ods.entity.NotiLog;
import com.med.ods.entity.NotiLogId;

@Repository
public class NotiLogDAOImpl extends GenericDAOImpl<NotiLog, NotiLogId> implements NotiLogDAO{

}
