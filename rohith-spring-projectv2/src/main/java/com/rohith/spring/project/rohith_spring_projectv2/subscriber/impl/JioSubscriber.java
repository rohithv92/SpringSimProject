package com.rohith.spring.project.rohith_spring_projectv2.subscriber.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rohith.spring.project.rohith_spring_projectv2.intrface.Service;
import com.rohith.spring.project.rohith_spring_projectv2.intrface.Sim;

@Component
public class JioSubscriber implements Sim {

	private List<Service> services;

	public List<Service> getServices() {
		System.out.println("List of service :" + services.size());
		return services;
	}

	@Autowired
	public void setServices(List<Service> services) {
		this.services = services;
	}

	public void subscriber() {

		System.out.println("You are an Jio subscriber");
		getServices();
		yourServices();

	}

	public void yourServices() {

		for (int i = 0; i < services.size(); i++) {
			services.get(i).services();
		}

	}

}
