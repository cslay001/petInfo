package org.coco.petinfo;

public class Bird extends Pet {

	public Bird(String name, String gender, String size, String breed) {
		super(name, gender, size, breed);
	}

	public void chirp() {
		System.out.println("chirp");
	}
	
	public void fly() {
		System.out.println("fly");
	}
}