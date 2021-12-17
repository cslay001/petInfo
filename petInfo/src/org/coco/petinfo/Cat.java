package org.coco.petinfo;

public class Cat extends Pet {

	public Cat(String name, String gender, String size, String breed) {
		super(name, gender, size, breed);
	}

	public void meow() {
		System.out.println("meow");
	}
	
	public void play() {
		System.out.println("play");
	}
}