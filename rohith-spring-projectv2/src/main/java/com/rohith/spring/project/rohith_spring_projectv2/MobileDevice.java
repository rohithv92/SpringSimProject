package com.rohith.spring.project.rohith_spring_projectv2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rohith.spring.project.rohith_spring_projectv2.builder.Person;
import com.rohith.spring.project.rohith_spring_projectv2.config.MobileConfig;



public class MobileDevice {

	public static void main(String []args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(MobileConfig.class);
		System.out.println("\n*****Loading beans successfull*****");
		Person person = context.getBean("person",Person.class);
		person.displayPersonInfo();
		((AnnotationConfigApplicationContext)context).close();

		
	}
}
