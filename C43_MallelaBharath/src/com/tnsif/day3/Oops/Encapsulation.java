package com.tnsif.day3.Oops;

public class Encapsulation {
	String name;
	int age;
	String dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public static void main(String[]args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("bharath");
		obj.setAge(21);
		obj.setDept("AI&DS");
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.dept);
	}
	

}
