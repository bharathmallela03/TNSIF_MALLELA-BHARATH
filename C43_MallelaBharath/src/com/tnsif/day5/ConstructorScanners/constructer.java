package com.tnsif.day5.ConstructorScanners;

public class constructer {
	String name;
	int age;
	String dept;
	public constructer(String name, int age, String dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "constructer[Name=" + name + ", Age=" + age + ", Dept=" + dept + "]";	
	}
	
	public static void main(String[] args) {
		constructer obj = new constructer("BHarath",20 , "AI");
		System.out.println(obj.toString());
		
	}
	
 
}
