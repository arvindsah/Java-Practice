package com.x.qa.test.leetcode;

import org.testng.annotations.Test;

public class ArrayProblems {
	
	@Test 
	public int[] twoSum(int[] nums, int target) {
        for (int index =0; index<nums.length-1; index ++)
            {
            for ( int secondI=index+1;secondI<nums.length; secondI++)
                
                {
                if (nums[index]+
                    nums[secondI]==target)
                    
                    { 
                    //System.out.println("//["+index+","+secondI+"]");
                      return new int[]{index,secondI};
                    }
                
            }
            
            }
        return null;
    }

}
