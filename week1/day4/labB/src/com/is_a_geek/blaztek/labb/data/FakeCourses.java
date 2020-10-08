package com.is_a_geek.blaztek.labb.data;

import java.util.ArrayList;
import java.util.List;

public class FakeCourses {
	private static final FakeCourses instance = new FakeCourses();
	private List<Course> courses;
	
	private FakeCourses() {
		this.courses = new ArrayList<>();
		
		courses.add(new Course("Java 101"));
		courses.add(new Course("Python 101"));
		courses.add(new Course("C++ 101"));
	}
	
	public static FakeCourses getInstance() {
		return instance;
	}
	
	
	public List<Course> getCourses() {
		return courses;
	}
}
