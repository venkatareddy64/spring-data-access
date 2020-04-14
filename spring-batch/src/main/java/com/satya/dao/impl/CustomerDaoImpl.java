package com.satya.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.satya.callback.MyBatchPreparedStatementSetter;
import com.satya.dao.ICustomerDao;
@Repository
public class CustomerDaoImpl implements ICustomerDao {
@Autowired
JdbcTemplate jdbcTemplate;
private static String SQL_QUERY="insert into customer values(?,?,?)";
	public int[] runBatch() {
	int result[]=jdbcTemplate.batchUpdate(SQL_QUERY,new MyBatchPreparedStatementSetter());
		return result;
	}

}
