package com.satya.dao;

import java.util.List;
import java.util.Map;

public interface IEmpDao {
	
	boolean addEmp(int empno,String ename,double sal,int deptno);
	Map findEmpById(int empno);
	List findAll();

}
