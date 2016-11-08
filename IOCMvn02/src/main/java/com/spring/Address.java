package com.spring;

public class Address {
	private int adid;
	private String street;
	private String city;
	public Address() {
		super();
	}
	public Address(int adid, String street, String city) {
		super();
		this.adid = adid;
		this.street = street;
		this.city = city;
	}
	public String toString(){
		return "Address : "+adid+"_"+street+"_"+city;
	}
}
