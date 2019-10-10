package com.ustglobal.contactlist.dto;

import javax.persistence.*;

@Entity
@Table
public class ContactBean {
	@Id
	@Column
	private String name;
	@Column
	private String number1;

	public String getNumber1() {
		return number1;
	}

	public void setNumber1(String number1) {
		this.number1 = number1;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column
	private String group1;
	@Column
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getGroup1() {
		return group1;
	}

	public void setGroup1(String group1) {
		this.group1 = group1;
	}

	

}
