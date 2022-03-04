package com.x.qa.test.inheritance;

import org.testng.annotations.Test;

public class PrivateEmp extends Person {
	
	@Test
	public void name() {
		setName("MyName");
		System.out.println(getName());
	}
}
