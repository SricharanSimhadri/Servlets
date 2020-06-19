package com.capgemini.empwebapp.service;

import java.util.List;

import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOImple;
import com.capgemini.empwebapp.dto.EmployeeTest;

public class EmployeeServiceImple  implements EmployeeService{

	
	private EmployeeDAO dao=new EmployeeDAOImple();

	@Override
	public EmployeeTest getEmployeeDetailsByname(String name) {
		// TODO Auto-generated method stub
		return dao.getEmployeeDetailsByname(name);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployeeInfo(id);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeTest bean) {
		// TODO Auto-generated method stub
		return dao.updateEmployeeInfo(bean);
	}

	@Override
	public boolean createEmployeeInfo(EmployeeTest bean) {
		// TODO Auto-generated method stub
		return dao.createEmployeeInfo(bean);
	}

	@Override
	public boolean addEmployeeInfo(EmployeeTest bean) {
		// TODO Auto-generated method stub
		return dao.addEmployeeInfo(bean);
	}

	@Override
	public List<EmployeeTest> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return dao.getAllEmployeeDetails();
	}

}
