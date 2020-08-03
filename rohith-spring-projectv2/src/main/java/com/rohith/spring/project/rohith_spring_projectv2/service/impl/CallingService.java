package com.rohith.spring.project.rohith_spring_projectv2.service.impl;

import org.springframework.stereotype.Component;

import com.rohith.spring.project.rohith_spring_projectv2.intrface.Service;

@Component
public class CallingService implements Service{

	public void services() {
		System.out.println("Calling service enabled");
		
	}

}
