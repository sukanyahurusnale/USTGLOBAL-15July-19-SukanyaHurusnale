package com.dev.exceptions;

public class CustomException extends Exception{
	public CustomException() {
          System.out.println("custom Exception");
	} 
	
	public CustomException(int i,int j) {
        System.out.println("custom Exception for integer");
	} 
	
	public CustomException(String s) {
        System.out.println("custom Exception string");
	} 
	
	
	public static void main(String[] args) {
	
		
	}

}
