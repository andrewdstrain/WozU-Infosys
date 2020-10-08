package com.is_a_geek.blaztek.labb;

import com.is_a_geek.blaztek.labb.displays.Display;
import com.is_a_geek.blaztek.labb.displays.MainMenu;

public class LabB {

	public static void main(String[] args) {
		Display display = new MainMenu();

		while (display != null) {
			display.displayText();
			display = display.executeCommand();
		}
	}

}
