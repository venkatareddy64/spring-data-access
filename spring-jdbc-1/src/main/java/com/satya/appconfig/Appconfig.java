package com.satya.appconfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
@ComponentScan(basePackages="com.satya")
public class Appconfig {
	@Bean
	public DataSource datasource()
	{
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/test");
		dmds.setUsername("root");
		dmds.setPassword("system");
		return dmds;
	}
	@Bean
	public JdbcTemplate jtemplate() {
	return new JdbcTemplate(datasource());

}
}
