package com.dev.inheritance;

public class Rectangle extends Area {
 int side=9;
  static Rectangle r=new Rectangle();	
	public void printArea()
	{
		super.printArea();
		int areaR=side*length*width;
		System.out.println("area of rect: "+areaR);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        r.printArea();
	}

}
