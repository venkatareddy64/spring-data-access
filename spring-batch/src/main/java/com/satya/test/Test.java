package com.satya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.satya.appconfig.Appconfig;
import com.satya.dao.ICustomerDao;
import com.satya.dao.impl.CustomerDaoImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig.class);
       ICustomerDao ic=ctx.getBean("customerDaoImpl",CustomerDaoImpl.class);
       int result[]=ic.runBatch();
       System.out.println("BatchExecuted");
	
	}

}
