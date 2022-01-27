package com.x.qa.model;

public class Address {
	private final int houseNumber;
	private final String street;
	private final String zipcode;
	private final String city;

	private Address(Builder builder) {
		this.houseNumber=builder.houseNumber;
		this.street = builder.street;
		this.zipcode = builder.zipcode;
		this.city = builder.city;
		
	}
	
	public int getHouseNumber() {
		return houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public String getCity() {
		return city;
	}

	public static class Builder {
		private  int houseNumber;
		private  String street;
		private  String zipcode;
		private  String city;
	
		public Builder houseNumber(final int houseNumber) {
			this.houseNumber=houseNumber;
			return this;
		}
		public Builder street(final String  street) {
			this.street=street;
			return this;
		}
		public Builder zipcode(final String  zipcode) {
			this.zipcode=zipcode;
			return this;
		}

		public Builder city(final String  city) {
			this.city=city;
			return this;
		}
		public Address build() {
			return new Address(this);
		}
		
	}
	
}