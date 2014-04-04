package com.art.unit4;

public class Cat implements Interaction{

	static int numberOfCats;
	int genNumber;
	
	public Cat(){
		genNumber=numberOfCats;
		numberOfCats++;
	}
	
	@Override
	public void voice() {
		System.out.print("Meow! ");
	}

	@Override
	public void introduce() {
		System.out.println("I'm a CAT #"+genNumber+". There are "+(numberOfCats-1)+" more cats in the room");
	}
}
