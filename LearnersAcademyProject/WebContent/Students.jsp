<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.service.AdminService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.bean.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>List of students in academy</h3>
<%
	AdminService service = new AdminService();
	ArrayList<StudentBean> list = service.allStudentList();
	Iterator<StudentBean> it = list.iterator();
	while(it.hasNext())
		out.println(it.next()+"<br>");
%>
</body>
</html>