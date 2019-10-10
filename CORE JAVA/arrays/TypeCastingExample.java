package com.dev.arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TypeCastingExample {

	public static void main(String[] args) {
		int i = 100;
		byte b = (byte) i;
		System.out.println(b);
		
		short s = (short) i;
		System.out.println(s);
		
		int r = b;
		System.out.println(r);
		
		float f = i;
		System.out.println(f);
		
		long a = 200;
		int b1 = (int) a;
		System.out.println(b1);
		
		
		double d=5.77;
		float s1=(float) d;
		
		System.out.println(s1);
		System.out.println(d);
		
		List<String> li=new ArrayList<String>();
		
		Scanner sc=new Scanner(System.in);
		int ii;
		System.out.println("enter the integer");
		ii=sc.nextInt();
		System.out.println(ii);

	}

}
