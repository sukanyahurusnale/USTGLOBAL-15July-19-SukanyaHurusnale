package com.dev.collections;
import java.util.*;

import com.dev.encapsulation.Pets;

public class C1 {

	public static void main(String[] args) {
		HashSet<Pets> hs= new HashSet<Pets>();
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

		//update
		p2.setAge(2);
		p.setAge(3);
		p1.setAge(4);

		boolean b=hs.add(p);
		boolean b2=hs.add(p1);
		boolean b3=hs.add(p2);

		System.out.println("output  of add(): "+b+" "+b2+" "+b3);
		
		//for each
		/*for(Pets pet:hs) {
			System.out.println(pet);
		}*/
		
	
		System.out.println(hs);

		boolean b4=hs.remove(p2);
		System.out.println("output  of add(): "+b4);
		System.out.println(hs);

		boolean bs=hs.contains(p2);
		System.out.println("output of contains(): "+bs);
		
		System.out.println("size of HashSet hs: "+hs.size());
		
		hs.clear();
		System.out.println("size of HashSet hs after clear: "+hs.size());
	}

}
