package com.x.qa.test.inheritance;

public class Person {

	private String name;
	private String gender;
	private int age;
	
	public Person(String name) {
		System.out.println("Constructor in Person");
		this.name = name;
	}
	
	  public Person() {
	  System.out.println("am empty contructor");
	  }
	 
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int i) {
		this.age = i;
	}

	

}
