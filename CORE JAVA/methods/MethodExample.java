package com.dev.methods;

public class MethodExample {
     
	public static int j=0;
 //static String s=" ";
	 
	static MethodExample me=new MethodExample();//create object  of class inside class outside method
	     
	public static void main(String[] args) {

		// MethodExample m1=new MethodExample();//to call non static method calcRect 
		// int area=calcArea(6);//static methods
		// System.out.println(area);


		j=calcArea(6);//we can call using static varible
		System.out.println(j);
		
		 
		//		int area1=m1.calcRect(2, 5);//non static method using object name
		//		System.out.println("area of rect: "+area1);

		//		int area1=me.calcRect(2, 5);
		//		System.out.println("area of rect: "+area1);

	}

	public static int calcArea(int side){
		//		int area= side * side;
		//		return area;

		j= side * side;
		System.out.println("clacArea meths"+j);

		int area1=me.calcRect(2, 5);
		System.out.println("area of rect: "+area1);

		return j;
	}
	
	public int calcRect(int len,int width){
		
//				int area=len*width;
//				return area;
				
		j=len*width;
		System.out.println(j);
		return j;
		 
	}
	
}

