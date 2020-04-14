package com.satya.callback;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;

public class MyBatchPreparedStatementSetter implements BatchPreparedStatementSetter {

	List<Integer>custIdsList=Arrays.asList(101,102,103);
	List<String>custNamesList=Arrays.asList("A","B","C");
	List<String>cityList=Arrays.asList("Hyd","Pune","Mumbai");
	public void setValues(PreparedStatement ps, int i) throws SQLException {
			ps.setInt(1, custIdsList.get(i));
			ps.setString(2, custNamesList.get(i));
			ps.setString(3, cityList.get(i));
		}

		public int getBatchSize() {
			return 3;
		}

	}
