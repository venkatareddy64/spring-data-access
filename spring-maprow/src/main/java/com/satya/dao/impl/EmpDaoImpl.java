package com.satya.dao.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.satya.collbacks.EmployeeExtractor;
import com.satya.dao.IEmpDao;
import com.satya.model.Employee;
@Repository
public class EmpDaoImpl implements IEmpDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	private static final String SQL_QUERY="select * from emp;";

	@Override
	public Set<Employee> findAllEmps() {
		return jdbcTemplate.query(SQL_QUERY,new EmployeeExtractor());
		}

}
