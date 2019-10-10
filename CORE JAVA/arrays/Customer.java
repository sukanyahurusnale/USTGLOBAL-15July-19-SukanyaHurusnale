package com.dev.arrays;

import com.dev.collections.Employee;

public class Customer implements  Comparable<Customer>{

	public Customer() {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.age = age;
	}
	
	public Customer(int i, String name, String email, String dob, int j) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", dob=" + dob + ", email=" + email + ", age=" + age + "]";
	}



	private int id;
	private String name;
	private String dob;
	private String email;
	private int age;
	
	
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}



	public static void main(String[] args) {
		
		

	}

	@Override
	public int compareTo(Customer d) {
		// TODO Auto-generated method stub
		return this.id-d.id;
	}

	

}
