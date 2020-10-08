package com.is_a_geek.blaztek.labb.displays;

/**
 * A class that implants a generic {@link Display}. The methods to
 * implement are {@link #displayText} and {@link #executeCommand}.}
 *
 */
public abstract class AbstractDisplay implements Display {

	// Attributes
	private static String footer = "=======================";
	private String header;
	
	@Override
	public abstract void displayText();

	@Override
	public abstract Display executeCommand();

	@Override
	public void setHeader(String header) {
		this.header = header;
	}

	@Override
	public String getHeader() {
		return header;
	}

	@Override
	public void setFooter(String footer) {
		AbstractDisplay.footer = footer;
	}

	@Override
	public String getFooter() {
		return footer;
	}

}
