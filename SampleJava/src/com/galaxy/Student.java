package com.galaxy;

import java.util.Comparator;

public class Student  {
	public int age;
	public String name;
	public String city;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int age, String name, String city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
	}
/*	@Override
	public int compareTo(Student s) {
		if(this.age>s.age){
			return 1;	
		}
		else if(this.age<s.age){
			return -1;
		}else{
			return 0;
		}*/
	

	

}
