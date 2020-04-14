package com.satya.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.satya.dao.IEmpDao;
@Repository
public class EmpDaoImpl implements IEmpDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	private static String SQL_QUERY="insert into emp values(?,?,?,?)";
	private static String SQL_QUERY1="select * from emp where empno=?";
	private static String SQL_QUERY2="select * from emp";

	public boolean addEmp(int empno, String ename, double sal, int deptno) {
		try
		{
			jdbcTemplate.update(SQL_QUERY, empno, ename,sal,deptno);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public Map findEmpById(int empno) {
		return jdbcTemplate.queryForMap(SQL_QUERY1,empno);
	}

	public List findAll() {
		return jdbcTemplate.queryForList(SQL_QUERY2);
	}

}
