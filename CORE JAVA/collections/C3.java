package com.dev.collections;

import java.util.TreeSet;

public class C3{

	public static void main(String[] args) {
		
		TreeSet<Employee> ts=new TreeSet<Employee>();
		Employee e=new Employee();
		e.setName("Sukanya");
		e.setId(17);
		e.setEmail("sukanya@gmail.com");
		e.setPassword("12345");

		Employee e1=new Employee();
		e1.setName("Palak");
		e1.setId(2);
		e1.setEmail("palak@gmail.com");
		e1.setPassword("12345");

		Employee e2=new Employee();
		e2.setName("Shweta");
		e2.setId(13);
		e2.setEmail("Shweta@gmail.com");
		e2.setPassword("1233333");
        ts.add(e);
        ts.add(e1);
        ts.add(e2);
        System.out.println(ts);
		
		
		

	}

}
