package org.coco.petinfo;

public class Bunny extends Pet {

	public Bunny(String name, String gender, String size, String breed) {
		super(name, gender, size, breed);
	}

	public void hop() {
		System.out.println("bunny - hop");
	}
	public void eat() {
		System.out.println("bunny - eat");
	}
	public void drink() {
		System.out.println("bunny - drink");
	}	
	public void feed() {
		System.out.println("bunny - feed");
	}
	public void water() {
		System.out.println("bunny - water");
	}
}
