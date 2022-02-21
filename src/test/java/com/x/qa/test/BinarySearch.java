package com.x.qa.test;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class BinarySearch {
	
	/**
	 * 1. search number using linear search 
	 * 2. search number using binary search (Using Arrays)
	 */
	private final static int LENGTH=5;
	@Test
	public void searchNumberUsingArraysBinarySearch() {
		
			int[] numberArray= new int[LENGTH];
			int numberToSearch;
			int userInputInterger;
			System.out.println("Enter "+LENGTH+ " numbers into array");
			Scanner scan= new Scanner(System.in);
			for(int index=0;index<LENGTH; index++) {
				//System.out.println("enter number to add into array");
				//numberArray[index]= scan.nextInt();	
				do {
					System.out.println("Enter "+(index+1)+"th number to add into array");
					userInputInterger= scan.nextInt();	
				}while(searchNumberManully(numberArray, userInputInterger));
				
				numberArray[index]=userInputInterger;
				
			}
			
			System.out.println("Enter the number to search in array" );
			numberToSearch= scan.nextInt();
			boolean isNumberExistInArray=searchNumber(numberArray, numberToSearch);
			System.out.println("is number already present in the array - " +isNumberExistInArray);
		
	}
	
	private boolean searchNumber(int[] numberArray, int numberToSearch) {
		Arrays.sort(numberArray);
		 int searchResult=Arrays.binarySearch(numberArray, numberToSearch);
		 
		 if(searchResult>0) {
			 return true;
		 }
		 return false;
	}
	
	private boolean searchNumberManully (int[] numberArray, int numberToSearch) {
		for(int value:numberArray) {
			if(value==numberToSearch) {
				System.out.println("Number found inside the numberArray");
				return true;
			}
		}
		return false;
	}
}
