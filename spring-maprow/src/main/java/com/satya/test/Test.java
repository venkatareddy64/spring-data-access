package com.satya.test;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.satya.appconfig.Appconfig;
import com.satya.dao.IEmpDao;
import com.satya.dao.impl.EmpDaoImpl;
import com.satya.model.Employee;

public class Test {
	public static void main(String args[])
	{
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig.class);
		IEmpDao i=ctx.getBean("empDaoImpl",EmpDaoImpl.class);
		Set<Employee> empList=i.findAllEmps();
		empList.forEach(e->System.out.println(e));
		
	}

}
