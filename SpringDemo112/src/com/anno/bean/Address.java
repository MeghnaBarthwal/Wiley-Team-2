package com.anno.bean;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String addressCity;
	private String addressState;
	
	
	public Address() {
		System.out.println("Address customer invoked");
		addressCity = "Mumbai";
		addressState = "Maharashtra";
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getAddressState() {
		return addressState;
	}

	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}
	
	
}
