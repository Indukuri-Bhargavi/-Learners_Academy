package com.dao;

public class TeachersDAOConstants {

	final static String TEACHER_TABLE_NAME = "TEACHERS1";
	final static String SELECT_TEACHER_QUERY="select * from "+TEACHER_TABLE_NAME;
	final static String SELECT_TEACHER_WHERE_Class_QUERY= "select * from "+TEACHER_TABLE_NAME+" where teacherclass=";

	

    final static String ID_COLUMN="teacherid";
	final static String NAME_COLUMN ="teachername";
	final static String SUBJECT_COLUMN="teachersubject";
	final static String CLASS_COLUMN="teacherclass";
	
	final static int NUMBER_0=0;
	final static int NUMBER_1=1;
	final static int NUMBER_2=2;
	final static int NUMBER_3=3;
	final static int NUMBER_4=4;
	
	
	
}
