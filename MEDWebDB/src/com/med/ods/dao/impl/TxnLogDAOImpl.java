package com.med.ods.dao.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.med.ods.dao.TxnLogDAO;
import com.med.ods.entity.TxnLog;

@Repository
public class TxnLogDAOImpl extends GenericDAOImpl<TxnLog, Integer> implements TxnLogDAO {

	private static Logger logger = LogManager.getLogger(TxnLogDAOImpl.class);


}
