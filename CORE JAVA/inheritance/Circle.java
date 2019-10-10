package com.dev.inheritance;

public class Circle extends Rectangle {

	int radius=2;
	static Circle c=new Circle();
	
	public void printArea()
	{
//		super.printArea();
		int area=radius*super.length;
		System.out.println("circle area= "+area);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           c.printArea();
	}

}
