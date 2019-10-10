package com.dev.springrest.dao;

import java.util.List;

import com.dev.springrest.dto.Employee;

public interface EmployeeDAO {

	public boolean addEmployee(Employee employee);

	public boolean removeEmployee(int id);

	public boolean modifyEmployee(Employee employee);

	public Employee getEmployee(int id);

	public List<Employee> getAllEmployee();

}
