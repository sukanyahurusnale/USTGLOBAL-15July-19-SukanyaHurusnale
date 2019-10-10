package com.dev.assessment;

public interface EmpInterface {

	public boolean addEmployee(String id,Employee e);
	public boolean  removeEmployee(String id,Employee e);
	public void calculateNetPay(Employee e,double d);
	public void calulateTax(Employee e,double d);
	public void getEmpoyee(String id);
	public void calulateSalGrade(Employee e,double sal);
	public void updateEmployee();
	
}
