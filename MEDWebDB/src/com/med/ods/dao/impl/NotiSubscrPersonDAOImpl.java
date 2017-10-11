package com.med.ods.dao.impl;

import org.springframework.stereotype.Repository;

import com.med.ods.dao.NotiSubscrPersonDAO;
import com.med.ods.entity.NotiSubscrPerson;
import com.med.ods.entity.NotiSubscrPersonId;
import com.med.ods.entity.NotiSubscrTbl;

@Repository
public class NotiSubscrPersonDAOImpl extends GenericDAOImpl<NotiSubscrPerson, NotiSubscrPersonId> implements NotiSubscrPersonDAO{

}
