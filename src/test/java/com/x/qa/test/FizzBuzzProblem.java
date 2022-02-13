package com.x.qa.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzzProblem {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
	 public static void fizzBuzz(int n) {
		    // Write your code here
		 for(int i=1;i<=n;i++)
		 {
			 
		 
		 if(i%3==0 && i%15 !=0)
		 {
			 System.out.println("Fizz");
			 continue;
		 }
		 
		 else if (i%5==0 && i%15 !=0) {
			 System.out.println("Buzz");
			 continue;
		 }
		 else if (i%15 ==0) {
			 System.out.println("FizzBuzz");
			 continue;
		 }
		 else {
			 System.out.println(i);
		 }
		 
		 }
		 
		    }
	
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        FizzBuzzProblem.fizzBuzz(n);

	        bufferedReader.close();
	    }
}
