package com.dev.inheritance;

public class GrandFather {

	String lastName="Stark";
	 String name="Torrhen";
	 static GrandFather g=new GrandFather();
	 
	 public void printName(){
		 System.out.println(g.name +" "+ g.lastName);
	 }
	
	public static void main(String[] args) {  
      g.printName();
      
	}
	
}
