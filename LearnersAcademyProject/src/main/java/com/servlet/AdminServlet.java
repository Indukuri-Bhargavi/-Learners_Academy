package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ClassBean;
import com.bean.StudentBean;
import com.service.AdminService;

/**
 * Servlet implementation class AdminServlet
 */
public class AdminServlet extends HttpServlet {

   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminId = request.getParameter("adminid");
		String pwd = request.getParameter("password");
		
		ClassBean userBean = new ClassBean();
		userBean.setUserName(adminId);
		userBean.setPassword(pwd);
		
		AdminService service = new AdminService();
		String arr[] = service.adminLogin();
		PrintWriter out = response.getWriter();
		if(arr[0].equalsIgnoreCase(adminId) && arr[1].equals(pwd))
		{
			RequestDispatcher rd = request.getRequestDispatcher("/AdminPage.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("/ViewPage.html");
			rd.include(request, response);
			out.print("<h3 align='center' style='color: red;'>Invalid Admin credentails</h3>");
		}
   	}
}
