package com.x.qa.model;

public class Name {
	

	private final String firstName;
	private final String middleName;
	private final String lastName;

	private Name(Builder builder) {
	
		this.firstName=builder.firstName;
		this.middleName = builder.middleName;
		this.lastName = builder.lastName;
		
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}
	public static class Builder{
		private  String firstName;
		private  String middleName;
		private  String lastName;
		
		public Builder firstName(String firstName) {
			this.firstName=firstName;
			return this;
		}
		public Builder lastName(String lastName) {
			this.lastName=lastName;
			return this;
		}
		public Builder middleName(String middleName) {
			this.middleName=middleName;
			return this;
		}
		
		public Name build() {
			return new Name(this);
		}
				
		
		
		
	}
}