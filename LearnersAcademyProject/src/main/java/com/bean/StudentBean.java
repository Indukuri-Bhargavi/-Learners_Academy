package com.bean;

public class StudentBean {
	
	int studentId;
	String studentName;
	int studentClass;
	
	public StudentBean(int studentId, String studentName, int studentClass) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentClass = studentClass;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}
	@Override
	public String toString() {
		return "[studentId=" + studentId + ", studentName=" + studentName + ", studentClass=" + studentClass
				+ "]";
	}
	
}
