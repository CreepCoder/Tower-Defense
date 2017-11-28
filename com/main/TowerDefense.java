package com.main;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.opengl.Texture;

import com.main.methods.DrawMap;
import com.main.methods.DrawSquare;
import com.main.methods.DrawTexture;
import com.main.methods.Session;

public class TowerDefense {	
	TowerDefense(){
		
	Session.BeginSession();
	
	while (!Display.isCloseRequested()) {
		DrawMap.Map();
		
		Display.update();
		Display.sync(60);
	}
	Display.destroy();
	}
	
	public static void main(String[ ] args) {
		new TowerDefense();
		System.out.println("Successfully booted.");
	}
}


