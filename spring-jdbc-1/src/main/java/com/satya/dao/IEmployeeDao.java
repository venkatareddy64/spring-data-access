package com.satya.dao;

import java.util.List;
import java.util.Map;

public interface IEmployeeDao {
	int updateEmp(int deptno,double sal);
	Map findEmpById(int empno);
	List findAll();
	

}
