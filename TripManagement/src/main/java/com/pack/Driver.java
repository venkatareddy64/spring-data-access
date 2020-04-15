package com.pack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Driver {
@Value("robbert")
private String name;
@Value("9849749946")
private long mobileno;
public void driver()
{
	System.out.println("driver-name:"+name);
	System.out.println("driver-mobile numbber:"+mobileno);
}
}
