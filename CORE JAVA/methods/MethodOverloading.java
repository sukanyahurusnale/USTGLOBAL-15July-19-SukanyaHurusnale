package com.dev.methods;

public class MethodOverloading {

	public void print() {
		System.out.println("this is print method with no-arg");
	}

	public int print(int i) {
		System.out.println("this is print method with int arg");
		return 1;
	}

	public String print(String i) {
		System.out.println("this is print method with string arg");
		return "a";
	}

	public void print(int i,int k) {
		System.out.println("this is print method with int  n int arg");	
	}

	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.print("d");
		mo.print(2);
		mo.print();

	}

}
