package com.ustglobal.ustspringcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.ustspringcore.beans.Animal;
import com.ustglobal.ustspringcore.beans.HelloWorld;
import com.ustglobal.ustspringcore.beans.Pet;

public class XmlConfigApp {
	public static void main(String[] args) {
		HelloWorld obj1 = new HelloWorld();
		obj1.setMsg("helloo sukanya");
		System.out.println(obj1.getMsg());
		System.out.println("Hello World!");

		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld obj2 = context.getBean(HelloWorld.class);
		System.out.println(obj2.getMsg());
		System.out.println(obj2.getCount());
		obj2.getAnimal().makeSound();

		// Animal animal=(Animal) context.getBean("human");
		
		/*
		 * Animal animal1 = (Animal) context.getBean("dog"); animal1.makeSound();
		 * 
		 * 
		 * System.out.println("****************************"); Pet pet =
		 * context.getBean(Pet.class); System.out.println(pet.getName());
		 * pet.getAnimal().makeSound();
		 */
		System.out.println(obj2.getMap());
		context.close();
		
	}

}
