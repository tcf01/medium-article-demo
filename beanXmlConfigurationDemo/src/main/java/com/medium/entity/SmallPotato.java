package com.medium.entity;

public class SmallPotato {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void greet() {
		System.out.println("My name is " + this.name + " and my age is " + this.age);
	}

	public void check(String otherPeopleName) {
		System.out.println(otherPeopleName + ", have you finished your work?");
	}


}
