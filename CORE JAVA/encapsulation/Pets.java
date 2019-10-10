package com.dev.encapsulation;

public class Pets {

	private int age;
	private String name;
	private String breed;
	private String color;
	private String pet;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPet() {
		return pet;
	}
	public void setPet(String pet) {
		this.pet = pet;
	}
	@Override
	public String toString() {
		return "Pets [age=" + age + ", name=" + name + ", breed=" + breed + ", color=" + color + ", pet=" + pet + "]";
	}
	
}
