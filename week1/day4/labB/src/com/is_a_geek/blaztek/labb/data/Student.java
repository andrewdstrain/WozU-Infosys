package com.is_a_geek.blaztek.labb.data;

public class Student {
	private String name;
	
	private Student() {
		super();
	}
	
	public Student(String name) {
		this();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
