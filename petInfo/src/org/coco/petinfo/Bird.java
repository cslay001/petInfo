package org.coco.petinfo;

public class Bird extends Pet {

	public Bird(String name, String gender, String size, String breed) {
		super(name, gender, size, breed);
	}

	public void chirp() {
		System.out.println("bird - chirp");
	}
	
	public void fly() {
		System.out.println("bird - fly");
	}
	public void eat() {
		System.out.println("bird - eat");
	}
	public void drink() {
		System.out.println("bird - drink");
	}	
	public void feed() {
		System.out.println("bird - feed");
	}
	public void water() {
		System.out.println("bird - water");
	}
}