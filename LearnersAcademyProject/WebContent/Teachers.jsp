<%@page import="java.util.Iterator"%>
<%@page import="com.service.AdminService"%>
<%@page import="com.bean.TeachersBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>List of Teachers in academy</h3>
<%
	AdminService service = new AdminService();
	ArrayList<TeachersBean> list = service.teachersList();
	Iterator<TeachersBean> it = list.iterator();
	while(it.hasNext())
		out.println(it.next()+"<br>");
%>
</body>
</html>