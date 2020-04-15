package com.pack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	@Value("venkatreddy")
	private String name;
	@Value("9885073164")
	private long mobileno;
	
	public void customer()
	{
		System.out.println("cutomer-name:"+name);
		System.out.println("customer-mobile number:"+mobileno);
	}

}
