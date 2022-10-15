package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bean.TeachersBean;
import com.util.DBConnection;

public class TeacherDao {

public  ArrayList<TeachersBean> getAllList() {
		
		ArrayList<TeachersBean> bean = new ArrayList<TeachersBean>();
		try {
			Connection con = DBConnection.getConnection();

			String sqlQuery = TeachersDAOConstants.SELECT_TEACHER_QUERY;
		
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(sqlQuery);
		
			while (rs.next()) {
				TeachersBean bean1 = new TeachersBean(rs.getString(TeachersDAOConstants.ID_COLUMN), rs.getString(TeachersDAOConstants.NAME_COLUMN),
						rs.getString(TeachersDAOConstants.SUBJECT_COLUMN),rs.getInt(TeachersDAOConstants.CLASS_COLUMN));
				bean.add(bean1);		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
	
	public  ArrayList<TeachersBean> getClassTeachersList(int studentclass) {
		
		ArrayList<TeachersBean> bean = new ArrayList<TeachersBean>();
		try {
			Connection con = DBConnection.getConnection();

			String sqlQuery = TeachersDAOConstants.SELECT_TEACHER_WHERE_Class_QUERY+studentclass;

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(sqlQuery);

			while (rs.next()) {
				TeachersBean bean1 = new TeachersBean(rs.getString(TeachersDAOConstants.ID_COLUMN), rs.getString(TeachersDAOConstants.NAME_COLUMN),
						rs.getString(TeachersDAOConstants.SUBJECT_COLUMN),rs.getInt(TeachersDAOConstants.CLASS_COLUMN));
				bean.add(bean1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
}
