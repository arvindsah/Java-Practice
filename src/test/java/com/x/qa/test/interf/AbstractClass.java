package com.x.qa.test.interf;

public abstract  class AbstractClass implements Mobile{
	
	// can have unimplemented methods
	// can't create object of abstract class
	//
	
	String brandName;
	
	public AbstractClass(String mobileBrand) {
		this.brandName=mobileBrand;
	}

	@Override
	public void makeACall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DisconnnectCall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMsg() {
		// TODO Auto-generated method stub
		
	}
	
	

}
