package com.dev.arrays;

import java.util.Scanner;

public class ArrayAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr2= {11,12,13,14,15};
		int index=2;
		System.out.println("length of array is "+intArr2.length);
		
		if(intArr2.length>index)
		{
			
			System.out.println("index found value is \n"+intArr2[index]);
			for(int i=0;i<=index;i++)
			{
				 System.out.println("values are "+ intArr2[i]);
			}
			
		}
		else
		{
			System.out.println("index not found at");
		}
		
		
	
		}
	}


