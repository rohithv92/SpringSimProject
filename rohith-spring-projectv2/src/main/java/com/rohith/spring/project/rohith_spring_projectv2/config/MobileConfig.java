package com.rohith.spring.project.rohith_spring_projectv2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.rohith.spring.project.rohith_spring_projectv2")
@PropertySource("classpath:person-info.properties")
public class MobileConfig {

}
