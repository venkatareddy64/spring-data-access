package com.satya.collbacks;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.satya.model.Employee;

public class EmployeeExtractor implements ResultSetExtractor<Set<Employee>> {
   @Override
public Set<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
	 Set<Employee> empSet =new HashSet<Employee>();
	   int count=1;
	   while(rs.next())
	   {
		   if(count%2!=0)
		   {
			   Employee e=new Employee();
			   e.setEmpno(rs.getInt(1));
			   e.setEname(rs.getString(2));
			   e.setSal(rs.getDouble(3));
			   e.setDeptno(rs.getInt(4));
			   empSet.add(e);
		   }
		   count++;
		   
	   }
	   return empSet;
	}
}

