package com.x.qa.test;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class BinarySearch {
	private final static int LENGTH=5;
	@Test
	public void searchNumberUsingArraysBinarySearch() {
		
			int[] numberArray= new int[LENGTH];
			int numberToSearch;
			System.out.println("Enter "+LENGTH+ " numbers into array");
			Scanner scan= new Scanner(System.in);
			for(int index:numberArray) {
				System.out.println("enter number to add into array");
				numberArray[index]= scan.nextInt();
			}
			
			System.out.println("enter the number to search in array" );
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
		//Arrays.sort(numberArray);
		
	}

}
