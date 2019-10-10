package com.ustglobal.mywebapp.dto;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="emp_info")
public class EmployeeInfoBean implements Serializable{

	@Id
	@Column
	private int emp_id;
	@Column
	private String emp_name;
	@Column
	private int emp_age;
	@Column
	private double emp_sal;
	@Column
	private String designation;
@Column
private String password;

	public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_age() {
		return emp_age;
	}

	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}

	public double getEmp_sal() {
		return emp_sal;
	}

	public void setEmp_sal(double emp_sal) {
		this.emp_sal = emp_sal;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
