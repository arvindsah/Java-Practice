package com.x.qa.test.inheritance;

public class Employee extends Person{
	private String id;

	public Employee(String id) {
		super("name of the person");
		System.out.println("Constructor in Emp");
		this.id = id;
	} 

}
