package com.is_a_geek.blaztek.labb.displays;

/**
 * 
 * Displays are used to display
 * {@link com.andystrain.tasky.actions.Action Action} items, get the proper
 * command to be executed, and execute it.
 *
 */
public interface Display {
	
	/**
	 * Displays choices that will be used for the given Action.
	 */
	void displayText();

	/**
	 * Prompts for a proper command and executes it.
	 * 
	 * @return The next Display to be viewed
	 */
	Display executeCommand();
	
	/**
	 * A header is to be displayed before the display choices.
	 * @param header The header to be displayed
	 */
	void setHeader(String header);
	
	/**
	 * A header is to be displayed before the display choices.
	 * @return The header to be displayed
	 */
	String getHeader();
	
	/**
	 * A footer is to be displayed after the display choices.
	 * @param footer The footer to be displayed
	 */
	void setFooter(String footer);
	
	/**
	 * A footer is to be displayed after the display choices.
	 * @return The footer to be displayed
	 */
	String getFooter();

}
