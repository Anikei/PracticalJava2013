package com.art.unit4;

public class Dog implements Interaction{

	private static int numberOfDogs;
	private int genNumber;
	
	public Dog(){
		genNumber=numberOfDogs;
		numberOfDogs++;
	}
	
	@Override
	public void voice() {
		System.out.print("Bark! ");
	}

	@Override
	public void introduce() {
		System.out.println("I'm a DOG #"+genNumber+". There are "+(numberOfDogs-1)+" more dogs in the room");
	}
}
