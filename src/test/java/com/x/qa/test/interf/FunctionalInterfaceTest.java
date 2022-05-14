package com.x.qa.test.interf;


public class FunctionalInterfaceTest {
	public static void print() {
		System.out.println("Arvind");
	}	
	
	public static void main(String[] args) {
		Sayable say=FunctionalInterfaceTest::printprint();
	}
		
	}

interface Sayable{  
    void say();  
}  
class Test2{
	
}
