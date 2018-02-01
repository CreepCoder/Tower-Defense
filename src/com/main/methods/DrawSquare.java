package com.main.methods;

import static org.lwjgl.opengl.GL11.*;

import org.newdawn.slick.opengl.Texture;

public class DrawSquare {
	public static void drawSquare(float x, float y, float width, float height) {
		glBegin(GL_QUADS);
		glVertex2f(x, y);
		glVertex2f(x + width, y);
		glVertex2f(x + width, y + height);
		glVertex2f(x, y + height);
		glEnd();
	}
	
	public static void drawSquareTexture(float x, float y, float width, float height, Texture texture) {
		texture.bind();
		glTranslatef(x, y, 0);
		glBegin(GL_QUADS);
		glTexCoord2f(0, 0);
		glVertex2f(0, 0);
		glTexCoord2f(1, 0);
		glVertex2f(width, 0);
		glTexCoord2f(1, 1);
		glVertex2f(width, height);
		glTexCoord2f(0, 1);
		glVertex2f(0, height);
		glEnd();
		glLoadIdentity();
	}
}
