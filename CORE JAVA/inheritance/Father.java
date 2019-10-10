package com.dev.inheritance;

public class Father extends GrandFather {

  static Father f=new Father();
  
 String name="Eddard"; //reinitialization of name of grandfather.name
     @Override
	public void printName(){
		//String name="Eddard";
    	 super.printName();//print the name of grandfather
		System.out.println(name+" "+super.name+" "+f.lastName);
	}
  

	public static void main(String[] args) {
		f.printName();
		
		
	}

}
