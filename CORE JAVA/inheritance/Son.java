package com.dev.inheritance;

public class Son extends Father {

	static Son s=new Son();
	
	@Override
	public void printName() {
		super.printName();// print the name from father if father called supper it also display th name of grandfather
		String name="Robb";
		System.out.println(name+" "+""+super.name+"  i" +s.lastName);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s.printName();

	}

}
