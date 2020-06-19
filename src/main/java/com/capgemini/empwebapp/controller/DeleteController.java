package com.capgemini.empwebapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOImple;

@SuppressWarnings("serial")
public class DeleteController extends HttpServlet{
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			String id=req.getParameter("id1");
			EmployeeService service=new EmployeeServiceImple();
			service.deleteEmployee(Integer.parseInt(id));
	}
	}