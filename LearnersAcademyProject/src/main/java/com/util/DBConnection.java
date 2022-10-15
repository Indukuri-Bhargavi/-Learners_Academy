package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection con;
	private final static String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	private final static String URL = "jdbc:oracle:thin:@localhost:1521:orcl1";
	private final static String USER_NAME = "scott";
	private final static String PASSOWRD = "tiger";

	public static Connection getConnection() {
		try {
			//class oracle driver class from oracle.jdbc.driver package these details are present in ojdbc jar file so add jar 
			Class.forName(DRIVER_NAME);
			//connecting to driver : 1521 is port and orc11 is database name created during installation
			 con = DriverManager.getConnection(URL,USER_NAME,PASSOWRD);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return con;
	}

}
