package com.dev.abstracts;

public class ConcreteClass  extends ParentAbstractt{

	public static void main(String[] args) {
		ConcreteClass cs=new ConcreteClass();
		cs.printData();
		cs.add(20, 2);
		

	}

	@Override
	public void printData() {
		System.out.println("this is method from parent");
		System.out.println("sukanya");
		
	}
	public void add(int a,int b) {
		int res=a*b;
		System.out.println("multiplication in concrete class extended by parent abstrct"+res);
	}

	
}
