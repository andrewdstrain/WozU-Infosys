package com.is_a_geek.blaztek.labb.displays;

import java.util.List;

import com.is_a_geek.blaztek.labb.data.Course;
import com.is_a_geek.blaztek.labb.data.FakeCourses;
import com.is_a_geek.blaztek.labb.data.InputReader;
import com.is_a_geek.blaztek.labb.data.Student;

public class EnrollCourse  extends AbstractDisplay {
	private List<Course> courses;
	
	public EnrollCourse() {
		setHeader("===Course Enrollment===");
		courses = FakeCourses.getInstance().getCourses();
	}

	@Override
	public void displayText() {
		System.out.println();
		System.out.println(getHeader());
		
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(String.valueOf(i + 1) + ". " + courses.get(i).getTitle());
		}
		
		System.out.println(getFooter());
		System.out.println();
	}

	@Override
	public Display executeCommand() {
		String command = InputReader.getInstance().getUserInput("Which course? ");

		if (command == null) {
			return null;
		}
		
		Integer index = processIndex(command);
		
		if (index == null) {
			return new MainMenu();
		}
		
		String name = InputReader.getInstance().getUserInput("Name: ");
		
		Student student = new Student(name);
		courses.get(index.intValue()).addStudent(student);
		
		return new MainMenu();
	}
	
	private Integer processIndex(String command) {
		int value;
		
		try {
			value = Integer.valueOf(command);
			return value - 1;
		} catch (NumberFormatException ex) {
			return null;
		}
	}
	
}
