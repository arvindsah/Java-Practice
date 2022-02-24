package com.x.qa.test;

import org.testng.annotations.Test;

public class TypeCasting {

	// byte (8 bit), boolean(1 bit), char 2 byte,  short 2 byte, int, float, long, double
	
	// 1 bit - 11-1011
	
	
	/**
	 * In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte

implicit type casting  lower to higher and - no complain
explict type casting higher to lower - comaplins

5 problem statement on type casting
	 */
	@Test
	public void intTypeCasting() {
		float number=7/2; //int/int= int  // implicit type casting
		float number2= (float)7/2; // explicit type
		System.out.println(number);
		System.out.println(number2);
		//getting some value from UI - multiple int value --
		// arverage 
		long longValue= 4393793793l;
		float floatValue= 2.5f;
		double doubleValue=4.39585757493893d;
		
		// WAP to check if 2 string are same
		String name = "Vivek";
		String anotherName = "vivek";
		System.out.println("check if name are same " + name.equalsIgnoreCase(anotherName));
		System.out.println("check if character exist in string - " + anotherName.contains("V"));
		
		
		char charValue='C';
		//WAP find occurance of charter if string
		//?23.45=driver.findeleent().getText
		String amountField="    ?23.35    ";
		amountField.trim();
		amountField.substring(1);
		System.out.println("23.25");
		
		
		
	}
}
