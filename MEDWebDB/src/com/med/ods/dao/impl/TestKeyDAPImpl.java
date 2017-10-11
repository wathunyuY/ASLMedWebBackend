package com.med.ods.dao.impl;

import org.springframework.stereotype.Repository;

import com.med.ods.dao.TestKeyDAO;
import com.med.ods.entity.Testkey;
import com.med.ods.entity.TestkeyId;

@Repository
public class TestKeyDAPImpl extends GenericDAOImpl<Testkey, TestkeyId> implements TestKeyDAO{

}
