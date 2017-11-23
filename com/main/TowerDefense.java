package com.main;

import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import com.main.methods.DrawSquare;

public class TowerDefense {	
	TowerDefense(){
	Display.setTitle("Tower Defense");
	try {
		Display.setDisplayMode(new DisplayMode(600, 400));
		Display.create();
	} catch (LWJGLException e) {
		e.printStackTrace();
	}
	
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	glOrtho(0, 600, 400, 0, 1, -1);
	glMatrixMode(GL_MODELVIEW);
	
	while (!Display.isCloseRequested()) {
		DrawSquare vierkant = new DrawSquare(100,100);
		DrawSquare vierkant2 = new DrawSquare(100,150);
		
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


