package com.ustglobal.ustspringcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements Animal {

	public Dog() {
		System.out.println("dog object created");
	}

	@PostConstruct // init annotation
	public void init() {
		System.out.println("dog init method");
	}

	public void destroy() {
		System.out.println("dog destroy method");

	}

	@PreDestroy // destroy annoation
	@Override
	public void makeSound() {
		System.out.println("BOOoooooooooooooooooooo...........");

	}

}
