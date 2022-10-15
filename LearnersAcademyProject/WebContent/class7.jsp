<%@page import="com.bean.TeachersBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.bean.StudentBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.service.AdminService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	AdminService service = new AdminService();
	out.print("<h3>List of 7th class students</h3>"+"<br>");
	ArrayList<StudentBean> bean=service.classList(7);
	Iterator<StudentBean> i = bean.iterator();
	while (i.hasNext())
	{
		out.println(i.next()+"<br>");
	}
		
	out.print("<h3>List of 7th class teachers </h3>"+"<br>");
	ArrayList<TeachersBean> bean1 = service.class_Teachers_List(7);
	Iterator<TeachersBean> it = bean1.iterator();
	while (it.hasNext())
		out.println(it.next()+"<br>");
%>
</body>
</html>