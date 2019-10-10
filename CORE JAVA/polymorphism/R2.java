package com.dev.polymorphism;

public class R2 extends RuntimePoly {
	
	String n="hurusnale";
	@Override
	public void printName() {
		System.out.println("name in child is "+n+" "+super.n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         R2 r=new R2();
         r.printName();
	}

}
