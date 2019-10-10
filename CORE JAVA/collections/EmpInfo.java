package com.dev.collections;

import java.util.HashSet;

import com.dev.encapsulation.Pets;

public class EmpInfo {

	public static void main(String[] args) {
		HashSet<Employee> hs= new HashSet<Employee>();
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

		//add method
		boolean b=hs.add(e);
		boolean b1=hs.add(e1);
		boolean b2=hs.add(e2);
		System.out.println("output of add() before update:"+b+" "+b1+" "+b2);
		System.out.println(hs+"\n");

		//update
		e.setEmail("suknyahurusnale@gmail.com");
		e1.setEmail("palakshivlakr@gmail.com");
		e2.setEmail("shwetajadhav@gmail.com");

		System.out.println("after update: "+hs+"\n");

		//remove method
		boolean b3=hs.remove(e);
		System.out.println("output after remove():"+hs+"\n");

		//contains method
		boolean b4=hs.contains(e1);
		System.out.println("output of conatins(): "+b4);

		//clear method
		hs.clear();
		System.out.println("output after clear() : "+hs);



	}

}
