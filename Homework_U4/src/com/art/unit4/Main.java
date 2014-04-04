package com.art.unit4;

import java.util.ArrayList;

public class Main {
	
	static ArrayList<Interaction> pets = new ArrayList<Interaction>();

	public static void main(String[] args) {
		
		System.out.println("Filling the room with random pets...");
		generatePets();
		
		System.out.println("When you open the door, you hear:");
		hearTheSound();
		
		System.out.println("\nRandom pet comes to you and says:");
		pets.get((int)(Math.random()*10)).introduce();
	}

	static void generatePets(){
		
		for (int i=0; i<10; i++){
			
			if (Math.random()*10<5){
				pets.add(new Cat());
				
			}else{
				pets.add(new Dog());
			}
		}
	}
	
	static void hearTheSound(){
		
		for (Interaction pet: pets){
			pet.voice();
		}
	}
	
}
