package com.x.qa.test.leetcode;

import java.util.Stack;

import org.testng.annotations.Test;

public class ValidParentheses {
	
	public static void main(String[] args) {
		System.out.println("result -" + checkValidParentheses());
	}
	@Test
	public static boolean checkValidParentheses() {
		String s = "((";
		Stack<Character> stack= new Stack();
		
		for(int i=0;i<s.length();i++) {
			char value=s.charAt(i);
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[' ) {
				stack.push(value);
				continue;
			}
			if(stack.size()==0) {
				return false;
			}
			
			char lastChar=stack.pop();
			switch(value) {
			case ')': 
				if(lastChar == '{' || lastChar == '[' ) {
					return false;
				}
				break;
				
			case '}': 
				if(lastChar == '(' || lastChar == '[' ) {
					return false;
				}
				break;
			case ']': 
				if(lastChar == '{' || lastChar == '(' ) {
					return false;
				}
				break;
			default:
					return false;
			}
			
			
			
		}
		if(stack.size()==0) {
			return true;
		}
		return false;
		
	}

}
