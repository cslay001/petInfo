package org.coco.petinfo;

public class Dog extends Pet {

	public Dog(String name, String gender, String size, String breed) {
		super(name, gender, size, breed);
	}

	public void bark() {
		System.out.println("bark");
	}
	
	public void walk() {
		System.out.println("walk");
	}
}
