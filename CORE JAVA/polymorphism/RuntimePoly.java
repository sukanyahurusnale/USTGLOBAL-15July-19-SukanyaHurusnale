package com.dev.polymorphism;

public class RuntimePoly  extends CompileTimePoly{
    String n="sukanya";
	 public void printName() {
		  System.out.println("name is "+n);
	 }
	 
	 @Override
	 public void printAdd(int a,int b) {  
		 
		 /*
		 * int f = 10;
		 * int res=a+b; System.out.println("result of addition is "+res);
		 */ 
		 super.printAdd(10,20); 
	   }
	 
	public static void main(String[] args) {
		
		RuntimePoly rt=new RuntimePoly();
		rt.printName();
		rt.printAdd(10, 10);
	}

}
