package com.dev.objectsmethods;

public class PetsData  {

	public static void main(String[] args) {
		Pets d1=new Pets();
		Pets d2=new Pets();
		Pets d3=new Pets();
		Pets d4=new Pets();
		Pets d5=new Pets();

		d1.setPet("Dog");
		d1.setAge(2);	
		d1.setBreed("Dober Man");
		d1.setColor("black");
		d1.setName("Shiro");

		d2.setPet("cat");
		d2.setAge(3);
		d2.setBreed("German");
		d2.setColor("balck&white");
		d2.setName("mani");

		d3.setPet("Tiger");
		d3.setAge(10);
		d3.setBreed("white tiger");
		d3.setColor("white");
		d3.setName("sukanya");

		d4.setPet("Rabbit");
		d4.setAge(4);
		d4.setBreed("wild Rabbit");
		d4.setColor("pure white");
		d4.setName("Rubby");
		

		d5.setPet("Rabbit");
		d5.setAge(4);
		d5.setBreed("wild Rabbit");
		d5.setColor("pure white");
		d5.setName("Rubby");

		Pets[] pets= {d1,d2,d3,d4};

		for(int i=0;i<pets.length;i++)
		{/*
			 * System.out.println("Pet is "+pets[i].getPet());
			 * System.out.println("Age is "+pets[i].getAge());
			 * System.out.println("Breed is "+pets[i].getBreed());
			 * System.out.println("Colr is "+pets[i].getColor());
			 * System.out.println("name is "+pets[i].getName());
			 * 
			 */
			System.out.println(pets[i]);
			System.out.println("**************************************");
		}
		
		System.out.println(d4.equals(d5));
		System.out.println(d4.hashCode());
		

		
	}

}
