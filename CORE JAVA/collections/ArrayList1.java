package com.dev.collections;
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		
		ArrayList<Employee> al=new ArrayList<Employee>(2);
		
		Employee e=new Employee();
		e.setName("Sukanya");
		e.setId(1);
		e.setEmail("sukanya@gmail.com");
		e.setPassword("******");

		Employee e1=new Employee();
		e1.setName("Palak");
		e1.setId(2);
		e1.setEmail("palak@gmail.com");
		e1.setPassword("*******");

		Employee e2=new Employee();
		e2.setName("Shweta");
		e2.setId(3);
		e2.setEmail("Shweta@gmail.com");
		e2.setPassword("1233333");                                       

		al.add(e);
		al.add(e1);
		al.add(e2);
		
		System.out.println(al);
		al.trimToSize();
		System.out.println("size of array aftr trimToSize(): "+al.size());

	}

}
