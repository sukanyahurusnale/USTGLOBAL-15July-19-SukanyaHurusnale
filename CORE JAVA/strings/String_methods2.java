package com.dev.strings;

public class String_methods2 {

	public static void main(String[] args) {

		String s="sukanya";
		String s1="SUKANYA";
		
		int l1=s.length();
		System.out.println("output of length()::"+l1);

		char c=s.charAt(5);
		System.out.println("output of charAt()::"+c);
		
		char[] c1=s.toCharArray();
		System.out.println("output of charAt()::"+c1[3]);
		
		boolean b=s.equals(s1);
		System.out.println("output of equals()::"+b);
		
		boolean b1=s.equalsIgnoreCase(s1);
		System.out.println("output of equalsIgnoreCase()::"+b1);
		
		boolean v=s.contains("SUK");
		System.out.println("op of contains()::"+v);
		
		String a=s1.substring(3); //index start from zero
		System.out.println("output of substring()"+a);
		
	     String a1=s1.substring(0,5);//it can take 2 agrument also 
		System.out.println("output of substring(2 arg)"+a1);
		
		
		
	}

}
