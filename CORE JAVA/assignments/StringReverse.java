package com.dev.assignments;

public class StringReverse {

	public static void main(String[] args) {
		
		String s="sukanya";
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=s.length()-1;i>=0;i--) {
			
			sb.append(s.charAt(i));
			//System.out.print(s.charAt(i));
			
		}
		
		System.out.println(" ");
		System.out.println("reverse string is:"+sb+"\n");
		
		
		//using reverse method
		StringBuilder sb1=new StringBuilder("hurusnale");
		System.out.println("reverse(): "+sb1.reverse());

	}

}
