package com.satya.test;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.satya.appconfig.Appconfig;
import com.satya.dao.IEmpDao;
import com.satya.dao.impl.EmpDaoImpl;

public class Test {
public static void main(String[] args) {
ApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig.class);
IEmpDao id=ctx.getBean("empDaoImpl",EmpDaoImpl.class);
boolean e=id.addEmp(127, "lohith",23000.00, 80);
{
	if(e==true)

System.out.println("added");

else
	System.out.println("not added");
}
Map map=id.findEmpById(124);
System.out.println(map);
List list=id.findAll();
System.out.println(list);

}

}
