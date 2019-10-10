package com.dev.abstracts;

public abstract class AbstractExample {
	
	public AbstractExample()
	{ 
		System.out.println("constructor of abstact class");
	}//constructor of abstract class
	
	public abstract void display(); //abstract  method
	public abstract void showData(); //2nd abstract method
	
     public  void show() {
    	  System.out.println("concrete method of abstract method ");
     }
 
	public static void main(String[] args) {
		
	}

}
