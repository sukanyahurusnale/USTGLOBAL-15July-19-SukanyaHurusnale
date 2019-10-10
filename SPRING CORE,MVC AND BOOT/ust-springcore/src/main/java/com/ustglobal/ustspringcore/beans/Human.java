package com.ustglobal.ustspringcore.beans;

import org.springframework.stereotype.Component;

@Component("human")
public class Human implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Bla bla bla bla bla bla");

	}

}
