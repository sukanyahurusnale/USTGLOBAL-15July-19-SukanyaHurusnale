package com.dev.inheritance;

public class SuperClass {

	public SuperClass() {
		System.out.println("cont with no argument");
	}
	public SuperClass(int i) {
		System.out.println("cont with int argument");
	}
	public SuperClass(String s,int i) {
		System.out.println("cont with  argument string then int");
	}
	public SuperClass(int i,String s) {
		System.out.println("cont with  argumentint then string ");
	}
	public SuperClass(String s) {
		System.out.println("cont with argument string");
	}
	public static void main(String[] args) {
		SuperClass s=new SuperClass();
		SuperClass s1=new SuperClass(1);
		SuperClass s2=new SuperClass("su");
		SuperClass s3=new SuperClass(1,"s");
		
	}

}
