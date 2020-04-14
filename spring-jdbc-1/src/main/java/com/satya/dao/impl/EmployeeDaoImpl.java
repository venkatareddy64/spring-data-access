package com.satya.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.satya.dao.IEmployeeDao;
@Repository
public class EmployeeDaoImpl implements IEmployeeDao {
@Autowired
JdbcTemplate jdbcTemplate;

	public int updateEmp(int deptno, double sal) {
		return jdbcTemplate.update("update emp set sal=? where deptno=?",sal,deptno);
	}

	public Map findEmpById(int empno) {

		return jdbcTemplate.queryForMap("select * from emp where  empno=?",empno);
	}

	public List findAll() {
		
		return jdbcTemplate.queryForList("select * from emp");
	}

}
