package com.dev.assessment;

public class Employee {
	
	private int empid;
	private String email;
	private String name;
	private String password;
	private double salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return email;
	}
	public void setEname(String ename) {
		this.email = ename;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", email=" + email + ", name=" + name + ", password=" + password
				+ ", salary=" + salary + "]";
	}
	

}
