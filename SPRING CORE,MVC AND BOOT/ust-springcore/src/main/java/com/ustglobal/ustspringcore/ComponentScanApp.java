package com.ustglobal.ustspringcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.SpringConfig;
import com.ustglobal.ustspringcore.beans.HelloWorld;

public class ComponentScanApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		HelloWorld obj=context.getBean(HelloWorld.class);
		obj.getAnimal().makeSound();
	}
}
