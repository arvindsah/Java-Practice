/**
 * 
 */
package com.x.qa.test;

import com.x.qa.model.Account;
import com.x.qa.model.Address;
import com.x.qa.model.Name;

/**
 * @author Admin
 *
 */
public class BuilderPattern {
	
	public void addAccountDetails() {
		
		/*
		 * Account account= new Account(1, "Arvind", null,"Sah", 50, "Foo bar road", "",
		 * "belfast london", "gmail@gmail.com");
		 */
		
		/*
		 * bad practice as the client do not know what is the value for which 
		 * value is supplied. over the life cycle people will keep adding the arguments which 
		 * eventually becomes absolute nightmare to manage
		 *
		 * Instead we should make use of multiple smaller classes which helps us in 
		 * more readability. ex - name class, address class, finally is consolidating 
		 * class as account class
		 * 
		 * builder pattern is object creation software design pattern used to solve this problem
		 *
		 * builder is nothing but chaning the object values
		 */

		Address address=new Address.Builder().city("Bangalore")
		.zipcode("560098")
		.houseNumber(851)
		.street("channasandra")
		.build();

		Name name = new Name.Builder()
				.firstName("Arvind")
				.lastName("Sah").build();
		
		Account account=new Account.Builder().address(address).name(name).build();
		
		
	}
	String name;

	public void setName(String name) {
		this.name=name;
		
	}

	public String getName() {
		return this.name;
		
	}

}
