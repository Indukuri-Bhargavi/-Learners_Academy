
package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import com.bean.SubjectBean;
import com.util.DBConnection;

public class SubjectDao {
	
	public  ArrayList<SubjectBean> getAllList() {
		
		ArrayList<SubjectBean> bean = new ArrayList<SubjectBean>();
		try {
			Connection con = DBConnection.getConnection();

			String sqlQuery = SubjectDAOConstants.SELECT_SUBJECT_QUERY;

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(sqlQuery);

			while (rs.next()) {
				SubjectBean bean1 = new SubjectBean(rs.getString(SubjectDAOConstants.CODE_COLUMN),rs.getString(SubjectDAOConstants.NAME_COLUMN));
				bean.add(bean1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
}
