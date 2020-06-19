package com.capgemini.empwebapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOImple;
import com.capgemini.empwebapp.dto.EmployeeTest;

@SuppressWarnings("serial")

@WebServlet("/addEmployee")

	public class AddController extends HttpServlet {
	    @SuppressWarnings("unused")
		@Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    String id=req.getParameter("id1");
	    String firstname=req.getParameter("fname");
	    String email=req.getParameter("mail");
	    String password=req.getParameter("pwd");
	   
	    
	    EmployeeTest demo=new EmployeeTest();
	    demo.setEmailId(id);
	    demo.setName(firstname);
	    demo.setEmailId(email);
	    EmployeeDAO dao=new EmployeeDAOImple();
	    dao.addEmployeeInfo(demo);
	    boolean check= dao.addEmployeeInfo(demo);

	}
	    
	    }