package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bean.ClassBean;
import com.util.DBConnection;


public class ClassDao {
	public ClassBean selectAdminByName()
	{
		ClassBean bean = null;
		try {
			Connection con = DBConnection.getConnection();
			
			String sqlQuery= "select * from class1";
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(sqlQuery);
			
			if(rs.next())
			{
				bean = new ClassBean();
				bean.setUserName(rs.getString("username"));
				bean.setPassword(rs.getString("password"));
			}
			con.setAutoCommit(false);
			con.commit();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bean;
	}
}