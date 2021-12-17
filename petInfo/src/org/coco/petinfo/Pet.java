package org.coco.petinfo;

public class Pet {

	private String name;
	private String gender;
	private String size;
	private String breed;
	
	public Pet(String name, String gender, String size, String breed) {
		this.name = name;
		this.gender = gender;
		this.size = size;
		this.breed = breed;
	}

	public void getName() {
		System.out.println(name);
	}
	public void getGender() {
		System.out.println(gender);
	}
	public void getSize() {
		System.out.println(size);
	}
	public void getBreed() {
		System.out.println(breed);
	}
}
