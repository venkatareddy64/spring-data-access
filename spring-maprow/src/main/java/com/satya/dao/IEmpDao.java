package com.satya.dao;

import java.util.Set;

import com.satya.model.Employee;

public interface IEmpDao {
	Set<Employee> findAllEmps();

}
