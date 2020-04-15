package com.pack.trip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.pack.Customer;
import com.pack.Driver;


@Component
public class Tripmanagement {
	@Value("ameerpet")
	private String source;
	@Value("hitech-city")
	private String destination;
	@Value("1500.00")
	private double amount;
	@Autowired
	private Customer Customer;
	@Autowired
	private Driver Driver;
	public void trip()
	{
		System.out.println(source);
		System.out.println(destination);
		System.out.println(amount);
	    }

}
