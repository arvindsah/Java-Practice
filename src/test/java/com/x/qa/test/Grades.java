package com.x.qa.test;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Grades {
	
	/**
	 * 1. dynamic array - create array at run time
	 * 2. string.format usage - 
	 * 3. gets grades
	 * 4. get average
	 * 5. get highest and lowest grades 
	 */
	
	private static int[] grades;
	Scanner scanner= new Scanner(System.in);
	
	
	@Test
	public void dynamicArray() {
		System.out.println("Enter number of grades");
		grades= new int[scanner.nextInt()];
		
		getGrades();
		System.out.println("Average - "+String.format("%.2f",calculateAverage()));
		System.out.println("Get lowest grade - " + getLowestGrade());
		System.out.println("Get Highest grade - " + getHighestGrade());
		
		
	}


	private int getHighestGrade() {
		int highest=grades[0];
		for(int index:grades) {
			if(highest<index) {
				highest=index;
			}
		}
		return highest;
	}


	private int getLowestGrade() {
		int lowest=grades[0];
		for(int index:grades) {
			if(lowest>index) {
				lowest=index;
			}
		}
		return lowest;
	}


	private double calculateAverage() {
	int sum=0;
		for(int grade: grades) {
			sum = sum+ grade;
		}
		return (sum/(grades.length));
	}


	private void getGrades() {
		for(int index=0; index<grades.length;index++) {
			System.out.println("Enter grade #" +(index+1) );
			grades[index]=scanner.nextInt();
		}
	}

}
