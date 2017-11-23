package com.main;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class TowerDefense {
	TowerDefense(){
	Display.setTitle("Hallo");
	try {
		Display.setDisplayMode(new DisplayMode(600, 400));
		Display.create();
	} catch (LWJGLException e) {
		e.printStackTrace();
	}
	while (!Display.isCloseRequested()) {
		
	}
	Display.destroy();
	
	}
	
	public static void main(String[ ] args) {
		new TowerDefense();
		System.out.println("Successfully booted.");
	}
}


