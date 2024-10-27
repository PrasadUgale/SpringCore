package com.prasad.spring.config;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.prasad.spring.bean.Employee;

@Configuration
@ComponentScan(basePackages = "com.prasad.spring")
public class AppConfig {
	
	
	static {
		System.out.println("AppConfig :: Loaded");
	}
	
	public AppConfig() {
		System.out.println("AppConfig :: Instantiated");
	}
	
	//Pure Java Configuration
	@Bean(name = "employee1")
	public Employee empObj1() {
		//Creating Target Object using zero param constructor
		Employee emp = new Employee();
		
		//Dependent Object
		LocalDateTime ldt = LocalDateTime.of(2020, 12, 15, 11, 1);
		
		//Setter Injection
		emp.setEid(1);
		emp.setEage(28);
		emp.setEname("Prasad");
		emp.setEaddress("Washington");
		emp.setBirthday(ldt);
		return emp;
	}
	
	//[Here no-arg constructor will also called as we already have a bean of employee which use no-arg constructor]
	@Bean(name = "employee2")
	public Employee empObj2() {
		//Dependent Object
		LocalDateTime ldt = LocalDateTime.of(2000, 12, 11, 2, 1);
			
		//Constructor Injection
		Employee emp = new Employee(2, "Gajanan", 49, "Delhi", ldt);
		return emp;
	}
	
}
