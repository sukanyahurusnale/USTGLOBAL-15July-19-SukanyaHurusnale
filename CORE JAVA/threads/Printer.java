package com.dev.threads;

public class Printer {

	synchronized public void printValue(int i,String thread) {
		
	  for(int k=1;k<=i;k++) {
		  System.out.println("Thread: "+thread+" "+"k: "+k);
	  }
	}
	
}
