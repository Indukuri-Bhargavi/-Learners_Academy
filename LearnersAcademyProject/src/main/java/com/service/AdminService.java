package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.bean.ClassBean;
import com.bean.StudentBean;
import com.bean.SubjectBean;
import com.bean.TeachersBean;
import com.dao.ClassDao;
import com.dao.StudentDao;
import com.dao.SubjectDAOConstants;
import com.dao.SubjectDao;
import com.dao.TeacherDao;

public class AdminService {

	StudentDao dao = new StudentDao();
	TeacherDao teacherDao = new TeacherDao();
	SubjectDao subjectDao = new SubjectDao();
	ClassDao cDao = new ClassDao();
	public ArrayList<StudentBean> allStudentList() {
		ArrayList<StudentBean> bean = dao.getAllList();
		return bean;
	}

	public ArrayList<TeachersBean> teachersList() {
		ArrayList<TeachersBean> bean = teacherDao.getAllList();
		return bean;
	}

	public ArrayList<SubjectBean> subjectList() {
		ArrayList<SubjectBean> bean = subjectDao.getAllList();
		return bean;
	}

	public ArrayList<StudentBean> classList(int n) {
		ArrayList<StudentBean> bean = dao.getClassList(n);
		return bean;
	}

	public  ArrayList<TeachersBean> class_Teachers_List(int n) {
		ArrayList<TeachersBean> bean = teacherDao.getClassTeachersList(n);
		return bean;
	}

	public String[] adminLogin() {
		
		cDao.selectAdminByName();
		ClassBean bean = new ClassBean();
		String arr[] = { bean.getUserName(), bean.getPassword() };
		return arr;
	}
}
