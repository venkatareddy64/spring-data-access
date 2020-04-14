package com.satya.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.satya.Employee.Employee;
import com.satya.dao.IEmployeeDao;

public class EmployeeDaoImpl implements IEmployeeDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	@Override
	public void saveEmp(Employee emp) {
		hibernateTemplate.save(emp);
	}

	@Override
	public Employee findEmp(Integer empno) {
		return hibernateTemplate.get(Employee.class, empno);
	}

	@Override
	public List<Employee> findAll() {
		return hibernateTemplate.loadAll(Employee.class);
	}

	@Override
	public void updateEmp(Employee emp) {
	hibernateTemplate.update(emp);
	}

	@Override
	public void deleteEmp(Integer empno) {
		Employee e=hibernateTemplate.get(Employee.class,empno);
		if(e!=null)
			hibernateTemplate.delete(e);
		
	}

}
