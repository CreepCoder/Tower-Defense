package com.main.methods;

import static org.lwjgl.opengl.GL11.*;

import org.newdawn.slick.opengl.Texture;

public class DrawSquare {
	public static void DrawSquare(int x, int y, int width, int height, Texture texture) {
		texture.bind();
		//glTranslatef(x, y, 0);
		glBegin(GL_QUADS);
		glTexCoord2f(0, 0);
		glVertex2f(x,y);
		glTexCoord2f(1, 0);
		glVertex2f(x+width,y);
		glTexCoord2f(1, 1);
		glVertex2f(x+width,y+height);
		glTexCoord2f(0, 1);
		glVertex2f(x,y+height);
		glLoadIdentity();
		glEnd();
	}
}
