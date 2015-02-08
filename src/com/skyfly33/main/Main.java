package com.skyfly33.main;

import com.skyfly33.handler.MenuHandler;

public class Main {

	public static void main(String[] args) {
		// Menu menu = MenuFactory.getInstance().menu;
		// int aa = menu.mainMenu(true);

		// Shape shape = new Circle(aaa);
		MenuHandler handler = new MenuHandler();
		handler.mainMenuHandler();
	}
} 
