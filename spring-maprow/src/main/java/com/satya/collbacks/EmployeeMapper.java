package com.satya.collbacks;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.satya.model.Employee;

public class EmployeeMapper implements RowMapper<Employee> {
	@Override
	public Employee mapRow(ResultSet rs,int rowNum)throws SQLException{
		Employee e=new Employee();
		e.setEmpno(rs.getInt(1));
		e.setEname(rs.getString(2));
	    e.setSal(rs.getDouble(3));
	    e.setDeptno(rs.getInt(4));
	return e;
	}
	

}
