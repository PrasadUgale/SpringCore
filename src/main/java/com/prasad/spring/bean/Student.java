package com.prasad.spring.bean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("student")
@PropertySource("application.properties")  //Extract value from application.properties
public class Student {
	
	//use the value for given variable in ${} from application.properties
	@Value("${com.student.id}")
	private Integer sid;
	@Value("${com.student.name}")
	private String sname;
	@Value("${com.student.address}")
	private String saddress;
	
	/*
	 * Search for bean of that class
	 * If found one injects it
	 * If none give NoSuchBeanDefinitionException
	 *  but If required=false is given it wont give error nor inject anything
	 * If more than one bean found NoUniqueBeanDefinitionException
	 * 		To handle it 
	 * 			i. IOC can bind byName
	 * 			ii. use @Qualifier on autowired field to resolve Ambiguity
	 * 			iii. use @Primary on top of dependent class
	 */	
	@Autowired(required=false)
	private LocalDateTime ldt;
	
	
	public LocalDateTime getLdt() {
		return ldt;
	}
	public void setLdt(LocalDateTime ldt) {
		this.ldt = ldt;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + "," + ldt + "]";
	}
}
