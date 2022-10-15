package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import com.bean.StudentBean;
import com.util.DBConnection;

public class StudentDao {
	
	public  ArrayList<StudentBean> getAllList() {
		
		ArrayList<StudentBean> bean = new ArrayList<StudentBean>();
		try {
			Connection con = DBConnection.getConnection();

			String sqlQuery = StudentDAOConstants.SELECT_Student_QUERY;

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(sqlQuery);

			while (rs.next()) {
				StudentBean bean1 = new StudentBean(rs.getInt(StudentDAOConstants.ID_COLUMN), rs.getString(StudentDAOConstants.NAME_COLUMN),
						rs.getInt(StudentDAOConstants.CLASS_COLUMN));
				bean.add(bean1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
	
	public  ArrayList<StudentBean> getClassList(int studentclass) {
		
		ArrayList<StudentBean> bean = new ArrayList<StudentBean>();
		try {
			Connection con = DBConnection.getConnection();

			String sqlQuery = StudentDAOConstants.SELECT_Student_WHERE_Class_QUERY+studentclass;

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(sqlQuery);

			while (rs.next()) {
				StudentBean bean1 = new StudentBean(rs.getInt(StudentDAOConstants.ID_COLUMN), rs.getString(StudentDAOConstants.NAME_COLUMN),
						rs.getInt(StudentDAOConstants.CLASS_COLUMN));
				bean.add(bean1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
	
}