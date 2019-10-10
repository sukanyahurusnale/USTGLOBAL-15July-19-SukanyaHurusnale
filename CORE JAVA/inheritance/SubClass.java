package com.dev.inheritance;

public class SubClass extends SuperClass{

	
	public SubClass() {
		//super();
		super("s",5);
		System.out.println("hii this is subclass no argument const\n");
		
	}
	public SubClass(int i) {
		//super();
		super(3);
		System.out.println("hii this is subclass int argument const\n");	
	}
	
	public SubClass(String s) {
		super();
		System.out.println("hii this is subclass string argument const\n");
	}
	
	public SubClass(int i,String s) {
		super(1,"s");
	}
	
	public static void main(String[] args) {
		SubClass s=new SubClass();  
		System.out.println(s);
		SubClass s2=new SubClass(1);  
		SubClass s3=new SubClass("ss");  
		SubClass s4=new SubClass(7,"f");  
	}

}
