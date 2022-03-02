package com.x.qa.test.leetcode;

import java.util.HashMap;
import java.util.Map;

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
	@Test
	public int[] twoSumOptSol(int[] nums, int target) {
		
		Map<Integer, Integer> map= new HashMap<>();
        for (int index =0; index<nums.length-1; index ++)
            {
        	map.put(nums[index], index);
            }
        
        
        for ( int secondI=0;secondI<nums.length; secondI++)
        {
        	
        	int complement=target- nums[secondI];        
         
                if (map.containsKey(complement) && map.get(secondI)!=secondI){
                	
                      return new int[]{secondI,map.get(complement)};
                    }
            }
        return null;
    }

}
