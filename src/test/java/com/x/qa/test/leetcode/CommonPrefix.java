package com.x.qa.test.leetcode;

import org.testng.annotations.Test;

public class CommonPrefix {
	
	public static void main(String[] args) {
		longestCommonPrefix();
	}
		@Test
	     static String longestCommonPrefix() {
	    	String[] strs= new String[] {"cir","car"};
	        /*Map <Integer, Integer> map=new Hashmap<>();
	        for(int i=0;i<strs.length;i++){
	            map.put(strs[i],strs[i].length());
	        }
	        int lowest=Collections.min(map.keySet());
	       int indexOfSmallStr= map.get(lowest);
	       */
	        
	        int min=strs[0].length();
	        String lowestStr="";
	         for(int i=0;i<strs.length;i++){
	         if(strs[i].length()<=min){
	             lowestStr=strs[i];
	             min=strs[i].length();
	         }
	         }
	        System.out.println(lowestStr);
	        for(int i=0;i<strs.length;i++){
	            System.out.println("running loop for i " + i + " - " + strs[i] );
	            for(int j=0;j<lowestStr.length();j++){
	            if(strs[i].charAt(j)== lowestStr.charAt(j)){
	                continue;
	            }else{
	                if(j==0){ return "";}
	                System.out.println(j);
	                lowestStr=lowestStr.substring(0,j);
	                System.out.println("subtring - "  + lowestStr);
	                  }
	             System.out.println(strs.length);
	         }             
	        }
	       return lowestStr; 
	    }
}
