package com.ustglobal.mywebapp.dao;

import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

public interface EmployeeDao {

	public EmployeeInfoBean serachEmployee(int id);

	public EmployeeInfoBean addEmployee(EmployeeInfoBean e);

	public boolean deleteEmployee(int id);

	public EmployeeInfoBean login(int empId, String password);

	public boolean updateEmployee(EmployeeInfoBean eb);
	
	

}
