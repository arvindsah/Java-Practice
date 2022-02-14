package com.x.qa.test;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ArraysProblem {

	@Test
	public void name() {
		// special object which stores same type of values
		// lenght of the array should be defined while creating
		// by defaul array stores zero for int
		// array starts with zero index
		
		int[] intArrays;// decalare 
		intArrays = new int[3] ;
		System.out.println(Arrays.toString(intArrays));
		
		intArrays[0]= 100;
		intArrays[1]= 101;
		intArrays[2]= 102;
		
		System.out.println(Arrays.toString(intArrays));
		
		int[] intArrays2 = new int[] { 5,6,7 };
		System.out.println(intArrays2[0]+", "+intArrays2[1]+", " + intArrays2[2]);
		// 5 problem statements based on array
		// 3 problme statement on variable scope
		// problme statement around setters and getters
	}
	
}
