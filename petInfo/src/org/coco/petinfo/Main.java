package org.coco.petinfo;

import java.util.Scanner;
/**
 * @author corey
 *
 */
public class Main {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("please input your name: ");		
		String userName = scanner.next();
		
		System.out.println("");
		System.out.println("hi " + userName + ", let's create your pet in our system");
		System.out.println(" ");	
		System.out.println("please input your pet's name: ");
		String petName = scanner.next();
		
		System.out.println("please input " + petName + "'s pet type: ");
		System.out.println("{1. Dog, 2. Cat, 3. Bird, 4. Bunny");
		int petTypeInt = scanner.nextInt();
		
		System.out.println("");
		System.out.println("please input " + petName + "'s gender: ");
		System.out.println("{F. female, M. male, P. prefer not to say");
		String petGender = scanner.next();
		
		System.out.println("");
		System.out.println("please input " + petName+ "'s size: ");
		System.out.println("{S. small, M. medium, L. large");
		String petSize = scanner.next();
		System.out.println("");
		
		System.out.println("please input " + petName+ "'s breed {unknown if not known}: ");
		String petBreed = scanner.next();
		
		Pet pet = new Pet(petName, petTypeInt, petGender, petSize, petBreed);
		
		System.out.println(" ");
		System.out.println("thank you " + userName + "! " + petName + " has been added to our system");
		System.out.println("**************************************************");
		System.out.println("CONFIRMATION OF ADDITION");
		System.out.println("name: " + petName);
		System.out.println("type: " + petTypeInt);
		System.out.println("gender: " + petGender);
		System.out.println("size: " + petSize);
		System.out.println("breed: " + petBreed);

	}

}
