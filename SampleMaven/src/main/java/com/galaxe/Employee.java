package com.galaxe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Employee {
	
	public String name;
	
	public String dep;
	
	@Autowired
	 Auto auto;
	
	@Autowired
	@Qualifier("address")
	public Address add;
	
	public String getName() {
		return name;
	}
	public void setName( String  name) {
		this.name = auto.m1();
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	

}
