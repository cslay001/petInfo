package org.coco.petinfo;

public class Pet {

	private String name;
	private int typeInt;
	private String gender;
	private String size;
	private String breed;
	
	public Pet(String name, int typeInt, String gender, String size, String breed) {
		this.name = name;
		this.typeInt = typeInt;
		this.gender = gender;
		this.size = size;
		this.breed = breed;
	}

	public void getName() {
		System.out.println(name);
	}
	public void getTypeInt() {
		System.out.println(typeInt);
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
