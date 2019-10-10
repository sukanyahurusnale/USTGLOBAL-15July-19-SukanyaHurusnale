package com.dev.assignments;

public class SumOfArray {

	public static void main(String[] args) {
		int a[]= {3,5,7,8,1,80,40};
		int first,mid,secondlast;
		
		first=a[0];
		mid=a[a.length/2];
		secondlast=a[a.length-2];
		int res=first+mid+secondlast;
		
		System.out.println("first element is: "+first);
		System.out.println("mid element is: "+mid);
		System.out.println("second element is: "+secondlast);
		System.out.println("sum is: "+res);
		

	}

}
