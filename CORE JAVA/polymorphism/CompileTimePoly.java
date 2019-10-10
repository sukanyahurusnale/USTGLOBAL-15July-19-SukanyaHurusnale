package com.dev.polymorphism;

public class CompileTimePoly {

	   public void printAdd(int a,int b)
	   {
		   int res=a+b;
		   System.out.println("result of addition is "+res);
	   }
	   public void printAdd(int a,int b,int d)
	   {
		   int res=a+b+d;
		   System.out.println("result of addition of 3 num is "+res);
	   }
	
	   public void printAdd(int a,int b,int d,int f)
	   {
		   int res=a+b+d+f;
		   System.out.println("result of addition of 4 num is "+res);
	   }
	
	public static void main(String[] args) {
		
		CompileTimePoly ct=new  CompileTimePoly();
		ct.printAdd(10, 30);
		ct.printAdd(10,20, 40);
		ct.printAdd(10,20,30,40);

	}

}
