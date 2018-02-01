package com.main;

import org.lwjgl.opengl.Display;

import com.main.methods.DrawMap;

public class TowerDefense {	
	TowerDefense(){
		
	Session.BeginSession();

	
	while (!Display.isCloseRequested()) {
		DrawMap.Map();
		
		Display.update();
		Display.sync(20);

		DrawMap.test.move();
	}
	Display.destroy();
	}
	
	public static void main(String[ ] args) {
		new TowerDefense();
		System.out.println("Successfully booted.");
	}
}


