package com.ustglobal.springcore.config;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ustglobal.ustspringcore.beans.Animal;
import com.ustglobal.ustspringcore.beans.Dog;
import com.ustglobal.ustspringcore.beans.HelloWorld;
import com.ustglobal.ustspringcore.beans.Human;

@Configuration
public class BeanConfig {

	@Bean(name = "obj") // (,autowire = Autowire.BY_TYPE) one way of autowire
	public HelloWorld getHelloWorld() {
		HelloWorld hello = new HelloWorld();
		hello.setMsg("hello Annotation configuration....!");
		hello.setCount(1000);

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 123);
		map.put("xyz", 456);
		hello.setMap(map);

		// Animal animal = getDog(); //upcasting
		// hello.setAnimal(getDog()); //wiring

		return hello;
	}// End of spring factory method(bean element)

	@Bean(name = "dog")
	@Scope("prototype") // to make scope as prototype
	public Dog getDog() {
		// Dog dog1 = new Dog();

		return new Dog();
	}// end of getdog

	
	@Bean(name="human")
	public Human getHuman() {
         
		
		return new Human();

	}// End of getHuman()
}
