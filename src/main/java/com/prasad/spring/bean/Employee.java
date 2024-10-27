package com.prasad.spring.bean;

import java.time.LocalDateTime;

public class Employee {
	private Integer eid;
	private String ename;
	private Integer eage;
	private String eaddress;
	//Has-A [InBuilt Type] 
	private LocalDateTime birthday;
	
	static {
		System.out.println("Employee :: Object Loaded");
	}
	
	public Employee() {
		System.out.println("Employee :: no-arg constructor called");
	}
	
	public Employee(Integer eid, String ename, Integer eage, String eaddress, LocalDateTime birthday) {
		System.out.println("Employee :: parameterized constructor called");
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.eaddress = eaddress;
		this.birthday = birthday;
	}



	public LocalDateTime getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDateTime birthday) {
		this.birthday = birthday;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getEage() {
		return eage;
	}
	public void setEage(Integer eage) {
		this.eage = eage;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eaddress=" + eaddress + ", birthday=" + birthday +"]";
	}
	
	
}