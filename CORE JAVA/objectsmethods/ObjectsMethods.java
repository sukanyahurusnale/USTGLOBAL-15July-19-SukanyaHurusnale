package com.dev.objectsmethods;

public class ObjectsMethods {

	public static void main(String[] args) {
		Pets p1=new Pets();
		Pets p2=new Pets();
		System.out.println(p1.getClass());
		System.out.println(p2.getClass());
		
		/*
		 * String p3=p1.getName();  return the name of class
		 * System.out.println(p3);
		 */
		
		
		boolean b=p1.equals(p2);
		System.out.println(b);
	}
	
}
