package com.dev.collections;

import java.util.HashMap;

import com.dev.encapsulation.Pets;

public class C2  {

	public static void main(String[] args) {
		HashMap<String,Pets> hm=new HashMap<String,Pets>();
		
		Pets p=new Pets();
		p.setAge(90);
		p.setBreed("tiger");
		p.setColor("brown");
		p.setName("Shiro");
		p.setPet("tiger");

		Pets p1=new Pets();
		p1.setAge(9);
		p1.setBreed("D M");
		p1.setColor("black");
		p1.setName("Ronnie");
		p1.setPet("Dog");

		Pets p2=new Pets();
		p2.setAge(3);
		p2.setBreed("streetDog");
		p2.setColor("black&");
		p2.setName("Nikkiee");
		p2.setPet("Dog");

		//put method()
		hm.put("1",p);
		//Pets b=hm.put("1",p); //return type is object
		//System.out.println(b);
		
		hm.put("2",p1);
		hm.put("3",p2);
		
		
		//Pets b1=hm.put("2",p1);
		//Pets b2=hm.put("3",p1);
		System.out.println(hm);
		
		
		//remove
		Pets ps=hm.remove("1");
		System.out.println("remove method return type object: "+ps);
		System.out.println(hm);
		
		//containsKey()
		System.out.println("output of containsKey(): "+ hm.containsKey("3"));
		
		//containsValue()
		System.out.println("output of containsValue(): "+ hm.containsValue(p2));
	}

}
