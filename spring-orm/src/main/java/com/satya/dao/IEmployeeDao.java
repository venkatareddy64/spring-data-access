package com.satya.dao;

import java.util.List;

import com.satya.Employee.Employee;

public interface IEmployeeDao {
	void saveEmp(Employee emp);
	Employee findEmp(Integer empno);
	List<Employee> findAll();
	void updateEmp(Employee emp);
	void deleteEmp(Integer empno);
	

}
