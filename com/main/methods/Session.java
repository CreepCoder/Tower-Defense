package com.main.methods;

import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Session {
public static void BeginSession() {
	Display.setTitle("Tower Defense");
	Display.setResizable(true);
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
	glEnable(GL_TEXTURE_2D);
	}
}
