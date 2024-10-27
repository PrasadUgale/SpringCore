package com.prasad.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component(value = "environmentAutowired")
public class EnvironmentAutowired {

	@Autowired
	private Environment environment;
	
	public void testEnvironment() {
		System.out.println("Environment Implementation class is :: "+environment.getClass());
		System.out.println("Extracting properties");
		System.out.println("url " + environment.getProperty("db.mysql.url"));
		System.out.println("username " + environment.getProperty("db.mysql.username"));
		System.out.println("password " + environment.getProperty("db.mysql.password"));
	}
}
