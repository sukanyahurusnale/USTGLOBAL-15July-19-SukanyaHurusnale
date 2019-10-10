package com.dev.arrays;
import java.util.Arrays;


public class CustomerDemo {

	public static void main(String[] args) {

		Customer c1=new Customer(17,"abc","ss@gmail.com","12092019",40);
		Customer c2=new Customer(12,"abcd","ss2@gmail.com","12092019",21);
		Customer c3=new Customer(38,"abcde","ss4@gmail.com","12092019",24);

		Customer[] objArray= {c1,c2,c3};

		Customer[] objArrayres=sortCustomerById(objArray);
		System.out.println(Arrays.toString(objArrayres));
		
		
		System.out.println("content of array");
		  for(Customer Customer:objArray) {
		  System.out.println(Customer.getId()+""+Customer.getName()+" "+Customer.
		 getEmail()+""+Customer.getDob()+""+Customer.getAge()); }
		 
		//System.out.println(Arrays.toString(objArray)); //Unsorted array  
		
	}

	public static Customer[] sortCustomerById(Customer[] objArray) {
		
		Arrays.sort(objArray);
		
		return objArray;
		
	}

}


