package com.dev.encapsulation;

public class StudentData {

	public static void main(String[] args) {
		Student sd=new Student();
		sd.setI(2001);
		sd.setEname("sukanya");
		sd.setEmail("suk@gmail.com");
		sd.setPassword("123456");
		
		
		System.out.println("regno is: "+sd.getI());
		System.out.println("name is: "+sd.getEname());
		System.out.println("email is: "+sd.getEmail());
		System.out.println("password is :******");
		
	}

}
