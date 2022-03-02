package com.x.qa.test.leetcode;

public class RomanToInteger {
	
	/**
	 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
	 * @param s
	 * @return
	 */

		    public int romanToInt(String s) {
	        int integerValue=0;
	        for (int characterValue=0;characterValue<s.length();characterValue++ )
	        {
	            int romanValue= getIntValue(s.charAt(characterValue));
	       
	            if(characterValue == (s.length()-1)){
	                integerValue=integerValue+romanValue;
	            }
	            else if (romanValue >=getIntValue(s.charAt(characterValue+1)) )
	        {
	            integerValue=integerValue+romanValue;
	        }else{
	            integerValue=integerValue-romanValue;
	        }
	    }
	        return integerValue;
	    }
	    
	    public int getIntValue(char value){
	        switch(value){
	            case 'I' : return 1; 
	                case 'V' : return 5;
	                case 'X' : return 10;
	                case 'L' : return 50;
	            case 'C' : return 100;
	                case 'D' : return 500;
	                case 'M' : return 1000;
	                
	        }
	        return 0;
	    }

	    
	    public int romanToIntPro(String s) {
	    	
	    	int decimalResult = 0;
			int lastNumber = 0;
			int length = s.length();
			
			for(int index = 0; index < length; index++){
				char letter = s.charAt(index);
				int currentNum = 0;

				//switch is faster than if-else statements
				switch(letter){
					case 'I': 
						currentNum = 1; break;
					case 'V':
						currentNum = 5; break;
					case 'X':
						currentNum = 10; break;
					case 'L':
						currentNum = 50; break;
					case 'C':
						currentNum = 100; break;
					case 'D':
						currentNum = 500; break;
					case 'M':
						currentNum = 1000; break;
				}
				
				//The previous number (number of the previous iteration, if any) was already added
				//but if that number is actually smaller than the new (current) one,
				//then the previous had to be subtracted, not added. 
				//So it is necessary to subtract it (the previous one) two times (2* lastNumber):
				//Once to compensate adding it wrong the first time, and a second time to dothe right operation.
				if( currentNum  > lastNumber)
					decimalResult -= (2 * lastNumber);
				
				//Each new digit is added without any further consideration
				decimalResult += currentNum;
				
				//The loop is done, but we keep this new number in memory for the previous comparation
				lastNumber = currentNum;
			}
			return decimalResult;
	    }
}
