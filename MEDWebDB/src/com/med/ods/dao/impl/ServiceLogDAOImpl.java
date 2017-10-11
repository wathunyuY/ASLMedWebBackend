package com.med.ods.dao.impl;

import org.springframework.stereotype.Repository;

import com.med.ods.dao.ServiceLogDAO;
import com.med.ods.entity.ServiceLog;

@Repository
public class ServiceLogDAOImpl extends GenericDAOImpl<ServiceLog, String> implements ServiceLogDAO {

}
