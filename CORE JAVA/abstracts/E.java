package com.dev.abstracts;

public class E implements Abs {

	public void display()
	{
		System.out.println("display implementation");
	}
	public static void main(String[] args) {
		Abs.print();
		E e=new E(); 
		e.display();
		
	}
	
}
