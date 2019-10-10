package com.dev.strings;

public class StringMethod {

	public static void main(String[] args) {

		String str = "some string";
		String s2 = "SOME string";

		int l = str.length();
		System.out.println("length " + l);// calculate length

		char c[] = str.toCharArray();
		System.out.println("toCharArray ::" + c[10]); // string to char array

		char s = str.charAt(8);
		System.out.println("charAt ::" + s); // return character at index

		boolean b = str.equals(s2);
		System.out.println("string equals: " + b);// compare strings

		boolean b1 = str.equalsIgnoreCase(s2);
		System.out.println("string equals without case : " + b1);// do not consider the case

		boolean v = str.contains("SUK");
		System.out.println("op of contains()::" + v); // search seq of char

		String k = str.replace('s', 'p');
		System.out.println("output of  replace()::" + k);

		int a = str.indexOf('d');
		System.out.println("output of indexOf()::" + a);

		String newa = str.toLowerCase();
		System.out.println("output of toLowerCase(::)" + newa);

		String newab = s2.toUpperCase();
		System.out.println("output of toUpperrCase()::" + newab);

	}

}
