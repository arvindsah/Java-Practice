package com.x.qa.test.inheritance;

public class Employee extends Person{
	
	private String id;

	public String getId(){
		return id;
	}
	
	public Employee(String id) {
		super();
		System.out.println("Constructor in Emp");
		this.id = id;
	} 
	
	public Employee(String name, String gender) {
		super("name of the person");
		System.out.println("Constructor in Emp");
		this.id = id;
	} 
	
	public Employee(String name, String gender, int age) {
		this("asj");// it can either be user this statement or super() and this should be the first statement 
		// of you contructor;
		setGender(gender);
		setAge(age);
		this.getGender();
	} 
	

}
