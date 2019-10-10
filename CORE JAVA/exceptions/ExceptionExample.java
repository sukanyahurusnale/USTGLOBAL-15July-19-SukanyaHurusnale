package com.dev.exceptions;

public class ExceptionExample {

	public static void arithmrtic() {
		int d=10;
		int q=0;
		System.out.println("result: "+d/q);
	}
	
	public static void main(String[] args) {
		arithmrtic();
		System.out.println(" before ");
		StringBuffer s=new StringBuffer(-1);
		System.out.println(" after ");
	}

}
