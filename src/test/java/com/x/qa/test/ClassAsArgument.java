package com.x.qa.test;

public class ClassAsArgument {
	
	//global variable
	String color;
	String name;
	int age;
	
	
	public String getColor() {
		return color;
	}
	// bad practice
	public void setAnimal(String color, String name, int ageI)
	{
		//local variable String color, String name, int ageI;
		
		this.color= color;
		this.name= name;
		this.age=ageI;
		
	}
	
	// good practive
	public void setAnimal(AnimalModel animalModel)
	{
		
	}
	
	public AnimalModel returnAnimalClass() {
		AnimalModel animalModel = new AnimalModel();
		animalModel.setAge(20);
		animalModel.setColor("Black");
		animalModel.setName("Zebra");
		
		return animalModel;
	}
	public int getSquare(int number) {
		return number*number;
	}
	public float getSquare(float f) {
		return f*f;
	}
	public double getSquare(double d) {
		return d*d;
	}
}
