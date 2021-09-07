package com.springcore.auto.wired.annotation;

public class Address {

	public String street;
	private String city;

	public String getStreet() {
		return street;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
