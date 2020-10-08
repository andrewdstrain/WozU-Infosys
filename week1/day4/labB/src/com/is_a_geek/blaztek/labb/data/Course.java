package com.is_a_geek.blaztek.labb.data;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String title;
	private List<Student> students;
	
	private Course() {
		super();
	}
	
	public Course(String title) {
		this();
		this.title = title;
		this.students = new ArrayList<Student>();
	}

	public String getTitle() {
		return title;
	}

	public List<Student> getStudents() {
		return students;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
}
