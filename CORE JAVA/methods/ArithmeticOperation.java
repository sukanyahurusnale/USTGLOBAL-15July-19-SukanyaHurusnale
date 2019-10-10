package com.dev.methods;

public class ArithmeticOperation {
	
	static ArithmeticOperation aa=new ArithmeticOperation();
	
	//+++++++++++++++ADDITION+++++++++++++++
	public int printAdd(int a,int b)
	{
		int c=a+b;
		System.out.println("addition of int two number "+c);
		return c;
	}

	public int printAdd(int a,int b,int d)
	{
		int c=a+b+d;
		System.out.println("addition of three  int number "+c);
		return c;
	}
	
	public void printAdd(float a,float b)
	{
		
		float c=a+b;
		System.out.println("additiion of two  float number "+c);
		
	}
	
	//+++++++++++++++++++++++++++++++++++++++ MULTIPLICATION+++++++++++++++++++++++++++++++++++++++++++++
	
	public void printMul(double a,double b,double d)
	{
		
		double c=a*b*d;
		System.out.println("multiplication of three double number "+c);
		
	}
	public void printMul(int a,int b,double d)
	{
		
		double c=a*b*d;
		System.out.println("multiplication of two int one  double number "+c);
		
	}
	
	
	
	//+++++++++++++++++++++++++++++++++++++MOD  ++++++++++++++++++++++++++++++++++++++++++
	public void printMod(byte b,byte c)
	{
		
		int d=b%c;
		System.out.println("mod of two  byte number "+d);
		
	}
	
	public void printMod(int b,int c)
	{
		
		int d=b%c;
		System.out.println("mod of two  int number "+d);
		
	}
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public int printSub(int a,int b)
	{
		int c=a-b;
		System.out.println("substraction of int two number "+c);
		return c;
	}

	public int printSub(int a,int b,int d)
	{
		int c=a-b-d;
		System.out.println("substraction of three  int number "+c);
		return c;
	}
	
	public void printSub(float a,float b)
	{
		
		float c=a-b;
		System.out.println("substraction of two  float number "+c);
		
	}
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public void printDiv(int a,int b)
	{
		float res=a/b;
		System.out.println("division is "+ res);
	}
	
	public void printDiv(float a,float b)
	{
		float res=a/b;
		System.out.println("division of 2 float no is "+ res);
	}
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public static void main(String[] args) {
		
		
			int ch = 8;
		 System.out.println("*********Menu*****");
		 System.out.println("\n1.addition of two integer");
		 System.out.println("\n2.addition of three integer");
		 System.out.println("\n3.addition of two float"); 
		 System.out.println("\n4.substraction of two integer");
		 System.out.println("\n5.substraction of three integer");
		 System.out.println("\n6.substraction of two float");
		 System.out.println("\n7.multiplication");
		 System.out.println("\n8.division");
		 System.out.println("\n9.modulus");
		 		
		 switch(ch) {
		 
		 case 1:
			 aa.printAdd(10,20);
			 break;
			 
		 case 2:
			 aa.printAdd(10,20,30);
			 break;
			 
		 case 3:
			 aa.printSub(40,20);
			 break;
		 case 4:
			 aa.printSub(50,20,10);
			 break; 
			 
		 case 5:
			 aa.printSub(50.4f,20.4f);
			 break; 
			 
		 case 6:
			 aa.printSub(50.4f,20.4f);
			 break; 
			
			 
		 case 7:
			 aa.printMul(50.4f,20.4f,10.3f);
			 aa.printMul(10,20,30);
			 break; 
			 
		 case 8:
			 aa.printDiv(50.4f,20.4f);
			 aa.printDiv(20, 2);
			 break; 
		 case 9:
			 aa.printMod(10, 2);
			 aa.printMod(5, 2);
			 break;
		default:
			
		}
		
		
	}

 }

