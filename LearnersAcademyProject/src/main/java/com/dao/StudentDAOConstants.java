package com.dao;

public class StudentDAOConstants {
	final static String Student_TABLE_NAME = "student1";
	
	final static String SELECT_Student_QUERY="select * from "+Student_TABLE_NAME;
	final static String SELECT_Student_WHERE_Class_QUERY= "select * from "+Student_TABLE_NAME+" where studentclass=";
	

	static final String ID_COLUMN="studentid";
	final static String NAME_COLUMN ="studentname";
	final static String CLASS_COLUMN="studentclass";	
}
