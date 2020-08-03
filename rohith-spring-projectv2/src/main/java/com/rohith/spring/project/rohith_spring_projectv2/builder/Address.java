package com.rohith.spring.project.rohith_spring_projectv2.builder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	private String addressInfo;
	private int pincode;

	@Value("Bangalore")
	public void setAddressInfo(String addressInfo) {
		this.addressInfo = addressInfo;
	}
	
	@Value("560097")
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public void displayAddress() {
		System.out.println("Address info  : " + addressInfo + "\npincode : " + pincode);
	}
}
