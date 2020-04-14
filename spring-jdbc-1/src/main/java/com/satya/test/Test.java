package com.satya.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.satya.appconfig.Appconfig;
import com.satya.dao.IEmployeeDao;
import com.satya.dao.impl.EmployeeDaoImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig.class);
		IEmployeeDao i=ctx.getBean("employeeDaoImpl",EmployeeDaoImpl.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the employee department no:");
		int deptno=sc.nextInt();
		System.out.println("enter the upadate Salary:");
		double sal=sc.nextDouble();
		int j=i.updateEmp(deptno,sal
				);
		System.out.println(j+"rows updated");
		
		System.out.println("==========================================");
       System.out.println("enter the employee number:");
		int empno=sc.nextInt();
	Map map=i.findEmpById(empno);
	System.out.println(map);
	System.out.println("========================================");
	List list=i.findAll();
	System.out.println(list);
	
	
	}

}
