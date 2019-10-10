 package com.dev.strings;

public class CreatingStrings {

	public static void main(String[] args) {
		
		String s; //declaration 
		s="hello";
		String str1="java"; //normal declaration n initialization
		String str2=new String("hello java"); //using new keyword
		System.out.println(s);
		System.out.println(str1);
		System.out.println(str2);
		
		//StringBuffer b="hello"; not allowed
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);
		
		StringBuilder sb1=new StringBuilder("java");
		System.out.println(sb+" "+sb1);
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		
		System.out.println("stringbuilderconst "+sb1.length());
		System.out.println("stringbuilderconst "+sb1.capacity());
		
		
	}

}
