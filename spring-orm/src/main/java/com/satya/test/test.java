package com.satya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.satya.Employee.Employee;
import com.satya.dao.IEmployeeDao;

public class test {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("Appconfig.xml");
	IEmployeeDao dao=(IEmployeeDao)ctx.getBean("employeeDaoImpl");
	Employee emp=dao.findEmp(123);
	}

}
