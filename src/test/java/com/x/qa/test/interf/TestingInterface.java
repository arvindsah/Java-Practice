package com.x.qa.test.interf;

public class TestingInterface {
	
	public static void name() {
		AbstractImplementation abstractImplementation= new AbstractImplementation("POCO");
		abstractImplementation.sendMsg();
		System.out.println("bran name - " +abstractImplementation.brandName);
	}

}
