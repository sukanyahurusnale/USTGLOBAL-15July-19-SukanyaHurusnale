package com.dev.threads;

public class Thread3 implements Runnable {


	@Override
	public void run() {

		System.out.println("runnable thread3 started");
		System.out.println("thread3 print the value of k");

		for(int j=1;j<=10;j++) {
			System.out.println("k: "+j);

		}

		System.out.println("runnable  thread3 terminated");

	}

}
