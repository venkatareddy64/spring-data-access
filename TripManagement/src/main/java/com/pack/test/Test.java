package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pack.Customer;
import com.pack.Driver;
import com.pack.config.AppConfig;
import com.pack.trip.Tripmanagement;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Tripmanagement tr=ctx.getBean("tripmanagement",Tripmanagement.class);
		tr.trip();
		Customer c=ctx.getBean("customer",Customer.class);
		c.customer();
		Driver d=ctx.getBean("driver",Driver.class);
		d.driver();
	}

}
