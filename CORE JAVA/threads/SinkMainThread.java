package com.dev.threads;

public class SinkMainThread {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("SyncMain Thread started......");
		
		Printer p=new Printer();
		Thread4 t4=new Thread4(p);
		t4.start();
		t4.join();
		new Thread5(p).start();
	
		
		System.out.println("SyncMain Thread terminated...");
		

	}

}
