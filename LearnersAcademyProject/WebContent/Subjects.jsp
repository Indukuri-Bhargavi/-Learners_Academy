<%@page import="java.util.Iterator"%>
<%@page import="com.service.AdminService"%>
<%@page import="com.bean.SubjectBean"%>
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
<h3>List of Subjects in academy</h3>
<%
	AdminService service = new AdminService();
	ArrayList<SubjectBean> list = service.subjectList();
	Iterator<SubjectBean> it = list.iterator();
	while(it.hasNext())
		out.println(it.next()+"<br>");
%>
</body>
</html>