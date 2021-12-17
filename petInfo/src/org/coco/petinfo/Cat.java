package org.coco.petinfo;

public class Cat extends Pet {

	public Cat(String name, String gender, String size, String breed) {
		super(name, gender, size, breed);
	}

	public void meow() {
		System.out.println("cat - meow");
	}
	
	public void play() {
		System.out.println("cat - play");
	}
	public void eat() {
		System.out.println("cat - eat");
	}
	public void drink() {
		System.out.println("cat - drink");
	}	
	public void feed() {
		System.out.println("cat - feed");
	}
	public void water() {
		System.out.println("cat - water");
	}
}