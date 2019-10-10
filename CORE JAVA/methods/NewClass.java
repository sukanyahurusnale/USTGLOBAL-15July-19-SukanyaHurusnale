package com.dev.methods;

public class NewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample me=new MethodExample(); //to access non static mem of other class
		int a=MethodExample.calcArea(7);//static method using class name in other class
		System.out.println(a);
		
		int a2=me.calcRect(5, 8);//calling non static using object
		System.out.println("area of rect"+a2);
		
	}
	

}

