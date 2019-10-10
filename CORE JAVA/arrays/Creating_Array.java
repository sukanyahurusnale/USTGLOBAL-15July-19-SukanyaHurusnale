package com.dev.arrays;

public class Creating_Array {

	public static void main(String[] args) {
		int[] intArr=new int[5];//declaration & creation
		char[]charArr=new char[5];
		byte []byteArr=new byte[5];

		intArr[0]=1; //initialization
		intArr[1]=2;
		intArr[2]=3;
		intArr[3]=4;
		intArr[4]=5;

		charArr[0]='a';//initialization
		charArr[1]='b';
		charArr[2]='c';
		charArr[3]='d';
		charArr[4]='e';
		
		byteArr[0]=1;//initialization
		byteArr[1]=2;
		byteArr[2]=3;
		byteArr[3]=4;
		byteArr[4]=5;
		
		int res1=intArr[1]*intArr[3];
		System.out.println("mult = "+res1);
		
		int res2=intArr[2]/2;
		System.out.println("devide= "+res2);
		
		int res3=intArr[3]+6;
		System.out.println("addition = "+res3);         
		
		int res4=intArr[2]-2;
		System.out.println("sub ="+res4);
		
		int res5=intArr[4]%2;
		System.out.println("mod ="+res5);
		
		int[] intArr2= {11,12,13,14,15}; //declaration and initialization
//		System.out.println(" array2 "+intArr2[3]);
//		System.out.println(" length of 2nd array is "+intArr2.length);//calculate length
		
		int a=intArr2.length;
		int mid= (a/2);
		System.out.println("mid is "+mid+" element is "+intArr2[mid]);
		
		
		char c[]=new char[8];//stores the address of object inside th c[]
		System.out.println("areee"+c);
		
	}
}
