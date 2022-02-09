package com.x.qa.test;

import org.testng.annotations.Test;

public class ClassAsArgumnetTest {
	
	/**
	 * class as argument
	 */
	@Test
	public void classAsArgument101 () {
		ClassAsArgument argument= new ClassAsArgument();
		argument.setAnimal("orange", null, 29);
		
		AnimalModel model = new AnimalModel();
		model.setAge(29);
		model.setColor("orange");
		
		argument.setAnimal(model);
	}
	
	
	/**
	 * classs as return type
	 */
	@Test
	public void classAsReturType() {
		
		ClassAsArgument argument= new ClassAsArgument();
		AnimalModel animalModel =argument.returnAnimalClass();
		System.out.println("Animal name -" +animalModel.name + "Animal Age" + 
				animalModel.age+ "Animal COlor" +
				animalModel.color);
		
	}
		@Test	
		public void methodOverLoading() {
				
				ClassAsArgument argument= new ClassAsArgument();
				
				argument.getSquare(5);
				argument.getSquare(3.4f);
				argument.getSquare(3.4d);
				
				AnimalModel animalModel =argument.returnAnimalClass();
				System.out.println("Animal name -" +animalModel.name + "Animal Age" + 
						animalModel.age+ "Animal COlor" +
						animalModel.color);
				
			}
	
	
	

}
