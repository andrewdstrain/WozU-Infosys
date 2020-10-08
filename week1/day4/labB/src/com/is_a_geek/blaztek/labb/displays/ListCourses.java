package com.is_a_geek.blaztek.labb.displays;

import java.util.List;

import com.is_a_geek.blaztek.labb.data.Course;
import com.is_a_geek.blaztek.labb.data.FakeCourses;
import com.is_a_geek.blaztek.labb.data.InputReader;

public class ListCourses extends AbstractDisplay {
	private List<Course> courses;
	
	public ListCourses() {
		setHeader("======Course List======");
		courses = FakeCourses.getInstance().getCourses();
	}

	@Override
	public void displayText() {
		System.out.println();
		System.out.println(getHeader());
		
		for (Course course : courses) {
			System.out.println(course.getTitle());
			
			if (course.getStudents().isEmpty()) {
				System.out.println("\tNo students enrolled");
			} else {
				System.out.println("\t" + course.getStudents());
			}
		}
		
		System.out.println(getFooter());
		System.out.println();
	}

	@Override
	public Display executeCommand() {
		String command = InputReader.getInstance().getUserInput("Press the Enter or Return key: ");
		return new MainMenu();
	}

}
