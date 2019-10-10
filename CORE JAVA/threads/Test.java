package com.dev.threads;

public class Test {

	public static void main(String[] args) {

		System.out.println("main thread started....");
		System.out.println("main thread print the value of i....");

		for(int i=1;i<=10;i++) {
			System.out.println("i: "+i);
		}

		for(int j=1;j<=10;j++) {
			System.out.println("j: "+j);
		}

		System.out.println("main thread terminated....");

	}

}
