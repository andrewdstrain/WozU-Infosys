package com.is_a_geek.blaztek.labb.data;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * 
 * This singleton has methods to read a line of input from {@code stdin} on
 * the console.
 * <p>
 * Again, the class that does this is hidden. But the System.console() method
 * doesn't always work because there is no guarantee that an actual console
 * is available. Take Eclipse's Console, for example, System.console() always
 * returns null.
 *
 */
public final class InputReader {

	// Attributes
	private Scanner scanner;
	private static final InputReader instance = new InputReader();

	private InputReader() {
		scanner = new Scanner(System.in);
	}

	/**
	 * Singleton here.
	 * 
	 * @return An instantiated class.
	 */
	public static InputReader getInstance() {
		return instance;
	}

	/**
	 * Reads a line of text from {@code stdin}.
	 * 
	 * @return The input from the user. Returns null upon end of file.
	 */
	public String readLine() {
		String input;

		try {
			input = scanner.nextLine();
		} catch (NoSuchElementException ex) {
			input = null;
		}

		return input;
	}

	/**
	 * This method is a helper method that prompts the user for the type of text
	 * that is required. It then reads the response.
	 * 
	 * @param prompt The text that the user sees.
	 * @return The input from the user. Can return null upon the end of the file.
	 */
	public String getUserInput(String prompt) {
		System.out.print(prompt);

		return readLine();
	}

}
