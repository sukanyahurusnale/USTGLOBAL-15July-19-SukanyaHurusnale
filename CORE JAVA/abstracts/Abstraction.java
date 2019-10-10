package com.dev.abstracts;

public  class  Abstraction extends AbstractExample{

	public Abstraction(){
		
		System.out.println("const of abstaction class");

	}

	@Override
	public void display() {
		super.show();
		System.out.println("this is implemented abstract method in child clASS ");

	}
	
	
	@Override
	public void showData() {
		
		
	}

	public static void main(String[] args) {

		Abstraction ab=new Abstraction();
		ab.display();
		//AbstractExample.show();
		//ab.show(); concrete method of abstract class
	}

	
}
