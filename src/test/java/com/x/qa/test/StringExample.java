package com.x.qa.test;

import java.util.Arrays;

import org.testng.annotations.Test;

public class StringExample {

	@Test
	public void stringManipulation() {
		
		
		//WAP find occurance of charter if string
		//?23.45=driver.findeleent().getText
		String amountField="?23.35 ";
		amountField.trim();
		amountField=amountField.substring(1);
		System.out.println(amountField);
		
		amountField.charAt(0);
		amountField.isEmpty();
		amountField.split(".");
		
		String booString="boo:and:foo";
		String[] booArray=booString.split(":");
		System.out.println(booArray[1]);
		System.out.println(Arrays.toString(booArray));
		
		//"Today's day is Monday"
		//WAP to print monday
		//WAP to remove all spaces 
		//WAP to reverse the string "VIvek" - "keviv";
		// use charAtMethod
		//
		String alphaNumeric="$%^FFF&&JK564763";
		alphaNumeric.split("/d");
		//alphaNumeric.replace(0, 0);
		alphaNumeric.replaceAll("F", "A");
		System.out.println("These are the chacters in the string" );
		// WAP using regex for split method
		
		float floatAmountField = Float.parseFloat(booString.trim().substring(1));
		String amountField2="464";
		int amountField2INtegerValue=Integer.parseInt(amountField2);
		System.out.println("print sum of amountValue + amountValue2");
		
		//WAP a program to compare the float values we got from UI
		// firs value is "$25.3746"
		//Second value is "$09.39373"
		// total value it "sum "
		//check total is correct
	}
}

