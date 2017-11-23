package com.main.methods;

import static org.lwjgl.opengl.GL11.*;

public class DrawSquare {
	public DrawSquare(int x, int y) {
		glBegin(GL_QUADS);
		glVertex2f(x,y);
		glVertex2f(x+50,y);
		glVertex2f(x+50,y+50);
		glVertex2f(x,y+50);
		glEnd();
	}
}
