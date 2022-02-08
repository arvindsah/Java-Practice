package com.x.qa.test;

import org.testng.annotations.Test;

public class ClassesAndObjects {
	
	//Day1 
	@Test
	public void classObjects() {
		
		//int[] intArray = new Array[]; 
		
		//1. creation of refence variable
		BuilderPattern buiPattern2; // Reference variable- this gives your random address of some memory which doesn't have any
									// building as of now 
		
		
		// 2. Creation of Object and the assignment
		buiPattern2 = new BuilderPattern(); // houseA
		
		// 3. setting property 
		buiPattern2.setName("Yalahanka"); // getting a blue print of the object which will be used for 
								// utlizing furhter
		
		System.out.println(buiPattern2.getName());
		
		buiPattern2 = new BuilderPattern();// new house - with address buiPattern2 - houseB
		
		// there is no way to reach houseA
		System.out.println(buiPattern2.getName());
		/*
		 * BuilderPattern buiPattern = new BuilderPattern();// reference variable
		 * 
		 * buiPattern.setName("Arvind");
		 * 
		 * System.out.println(buiPattern.getName()); /// O/P - Arvind
		 * 
		 * buiPattern = new BuilderPattern();
		 * 
		 * System.out.println(buiPattern.getName()); /// o/p - Arvind
		 */		
	}

}
