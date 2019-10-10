package com.dev.threads;

public class Thread1 {

	public static void main(String[] args) {

		System.out.println("main thread started....");

		/*
		 * T3 t3=new T3(); 
		 * Thread t=new Thread(t3); 
		 * t.start();
		 */

		new Thread2().start(); //create an object of T2() n calling start() 

		Thread.currentThread().setName("NewAssignName");

		Thread2 t2=new Thread2();
		t2.setName("sukkkk");

		Thread t=new Thread();
		
		new Thread(new Thread3()).start();

		for(int i=1;i<=10;i++) {
			System.out.println("i: "+i);
		}

		System.out.println("thread name2 : "+t2.getName());
		System.out.println("thread name1 : "+Thread.currentThread().getName());
		System.out.println("thread2 id : "+t2.getId());
		System.out.println("thread3 id : "+t.getId());
		System.out.println("main thread id : "+Thread.currentThread().getId());
		System.out.println("main thread id : "+Thread.currentThread().getId());
		
		t2.setPriority(2);
		System.out.println("thread2  priority : "+t2.getPriority());
		
		t.setPriority(5);
		System.out.println("thread  priority : "+t.getPriority());
	
		System.out.println("main thread terminated....");

	}






}
