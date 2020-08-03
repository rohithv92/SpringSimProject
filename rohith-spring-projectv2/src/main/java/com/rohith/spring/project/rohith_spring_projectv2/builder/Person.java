package com.rohith.spring.project.rohith_spring_projectv2.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.rohith.spring.project.rohith_spring_projectv2.intrface.Sim;


@Component
public class Person {

	private String personName;
	private String personAge;
	private Address address;
	private Sim sim;

	@Value("${person.personName}")      // loads from property file.
	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Value("${person.age}")      // loads from property file.
	public void setPersonAge(String personAge) {
		this.personAge = personAge;
	}
	
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Autowired
	@Qualifier("jioSubscriber")
	public void setSim(Sim sim) {
		this.sim = sim;
	}

	public void displayPersonInfo() {
		System.out.println("Person info  name : " + personName + "\nage : " + personAge);
		address.displayAddress();
		sim.subscriber();
	}

}
