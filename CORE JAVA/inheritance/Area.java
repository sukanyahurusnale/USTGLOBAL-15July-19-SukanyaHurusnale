package com.dev.inheritance;

public class Area {

	int length=10;
	int width=6;
	 static Area a=new Area();
	public  void printArea()
	{
		int area=length*width;
		System.out.println("Area is : "+area);
	}
	public static void main(String[] args) {
	
	a.printArea();

	}

}
