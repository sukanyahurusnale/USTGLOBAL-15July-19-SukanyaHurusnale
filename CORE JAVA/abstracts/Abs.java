package com.dev.abstracts;

@FunctionalInterface
public interface Abs  {
	
	/*
	 * final int i=2; 
	 * static int j=2; 
	 * public int k=0;  Allowed 
	 */
	/*----------------------------------*/
	/*
	 * private int p=8; 
	 * protected int h=6; not allowed
	 */	 
	void display();
	//void display1(); we can give only one abstrat method
	
	   static void print()
	 {
		  System.out.println("this is concrete method in interface");
	 }

	   static void print1()
		 {
			  System.out.println("this is concrete method in interface");
		 }

}