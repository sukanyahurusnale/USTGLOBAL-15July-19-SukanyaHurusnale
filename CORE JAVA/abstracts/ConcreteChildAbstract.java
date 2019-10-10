package com.dev.abstracts;

public class ConcreteChildAbstract  extends ChildAbstract{

	public static void main(String[] args) {
		ConcreteChildAbstract cca=new ConcreteChildAbstract();
		cca.printData();
		cca.child();
		cca.mul();

	}

	@Override
	public void child() {
	
		System.out.println("this is child abstract method from child abstract method");
	}

	

	

}
