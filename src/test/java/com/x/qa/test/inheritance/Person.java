package com.x.qa.test.inheritance;

public class Person {
	
	public Person(String name) {
		System.out.println("Constructor in Person");
		this.name = name;
	}
	
	private String name;
	private String gender;
	private String age;
	
	
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	

}
