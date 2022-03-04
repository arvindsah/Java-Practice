package com.x.qa.test.inheritance;

public class Inheritance {
	
	public static void main(String ars[]) {
		Employee employee= new Employee("23945");
		//Employee employee= new Employee("ID of the employee");
		employee.getId();
		employee.setName("Udated Name");
		employee.getName();
		
		employee.setAge(30);
		System.out.println("My age is - " + employee.getAge());
		
		//inheritance is also called as is-a relationship
		
		//this, super, default, calling contrutor within another constuctor
		//calling diffrent argument contuctor
		//this keyword for accessing internal methods and variavble
		
		//5 diffrent problems based on above concepts
	}
}
