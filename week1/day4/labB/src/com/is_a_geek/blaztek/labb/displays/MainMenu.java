package com.is_a_geek.blaztek.labb.displays;

import com.is_a_geek.blaztek.labb.data.InputReader;

/**
 * 
 * Displays the main menu on stdout.
 *
 */
public class MainMenu extends AbstractDisplay {
	
	public MainMenu() {
		setHeader("=======Main Menu=======");
	}

	@Override
	public void displayText() {
		System.out.println();
		System.out.println(getHeader());
		System.out.println("1. List courses");
		System.out.println("2. Enroll in course");
		System.out.println(getFooter());
		System.out.println();
	}

	@Override
	public Display executeCommand() {
		String command = InputReader.getInstance().getUserInput("What would you like to do? ");

		// Check for end of file
		if (command == null) {
			return null;
		}

		switch (command) {
		case "1":
			return new ListCourses();
		case "2":
			return new EnrollCourse();
		}

		return this;
	}

}
