package com.dev.assignments;

import java.util.Scanner;

public class ReverseOfArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter the array elements");
		for(int j=0;j<n;j++) {
			a[j]=sc.nextInt();
		}

		System.out.println("reverse of array is ");
		for(int i=n-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		
	}

}
