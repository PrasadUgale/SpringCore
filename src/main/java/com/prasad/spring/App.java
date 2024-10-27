package com.prasad.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.prasad.spring.bean.Employee;
import com.prasad.spring.bean.Student;
import com.prasad.spring.config.AppConfig;
import com.prasad.spring.demo.EnvironmentAutowired;

/**
 * Hello world!
 */
public class App {
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose the Demo");
		System.out.println("1. Pure Java Config Setter Injection");
		System.out.println("2. Pure Java Config Constructor Injection");
		System.out.println("3. Annotation Configuration, Field Injection");
		System.out.println("4. Autowired Componend, Field Injection");
		
		int opt = sc.nextInt();

		//Creating ApplicationContext using the configuration file
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		
		switch (opt) {
			case 1: {
		    	
		    	//Get Bean from appContext using specified name (if not method name is used)
		    	//Pure Java Config:: Getter Injection
		    	Employee emp1 = context.getBean("employee1", Employee.class);
		    	System.out.println(emp1.toString());
		    	
		    	//Close the container
		    	((AbstractApplicationContext) context).close();
		    	break;
			}
			
			case 2 : {
		    	
		    	//Get Bean from appContext using specified name (if not method name is used)
		    	//Pure Java Config:: Constructor Injection
		    	Employee emp2 = context.getBean("employee2", Employee.class);
		    	System.out.println(emp2.toString());
		    	
		    	//Close the container
		    	((AbstractApplicationContext) context).close();
		    	break;
			}
			
			case 3 : {
			
				Student std = context.getBean("student", Student.class);
				System.out.println(std);
				break;
			}
			
			case 4 : {
				EnvironmentAutowired enav =  context.getBean("environmentAutowired" , EnvironmentAutowired.class);
				enav.testEnvironment();
				//We can use this environment to inject it in DriverManagerDataSource to get the connection
				break;
			}
			
			default:
				System.out.println("No such Options");
		}
		
    	
		
    	
    	
    }
}
