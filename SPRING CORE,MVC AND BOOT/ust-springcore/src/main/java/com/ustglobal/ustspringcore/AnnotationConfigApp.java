package com.ustglobal.ustspringcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.BeanConfig;
import com.ustglobal.ustspringcore.beans.Animal;
import com.ustglobal.ustspringcore.beans.HelloWorld;

public class AnnotationConfigApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		HelloWorld obj = context.getBean(HelloWorld.class);
		System.out.println("get message: " + obj.getMsg());
		System.out.println("get count: " + obj.getCount());
		System.out.println("get map: " + obj.getMap());
		
		obj.getAnimal().makeSound();
		
		/*
		 * Animal animal1=context.getBean(Animal.class); Animal
		 * animal2=context.getBean(Animal.class); //scope=prototype so result=false
		 */
		
		Animal animal1=(Animal) context.getBean("dog");
		Animal animal2=(Animal) context.getBean("dog");
		System.out.println(animal1==animal2); 
		
		context.close();
	
	}
}
