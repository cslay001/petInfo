package org.coco.petinfo;

public class Dog extends Pet {

	public Dog(String name, int typeInt, String gender, String size, String breed) {
		super(name, typeInt, gender, size, breed);
	}

	public void bark() {
		System.out.println("dog - bark");
	}
	
	public void walk() {
		System.out.println("dog - walk");
	}
	public void eat() {
		System.out.println("dog - eat");
	}
	public void drink() {
		System.out.println("dog - drink");
	}	
	public void feed() {
		System.out.println("dog - feed");
	}
	public void water() {
		System.out.println("dog - water");
	}
}
