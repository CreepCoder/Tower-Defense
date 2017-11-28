package com.main.methods;

import static org.lwjgl.opengl.GL11.*;

import org.newdawn.slick.opengl.Texture;

public class DrawSquare {
	public static void DrawSquare(int x, int y, Texture texture) {
		texture.bind();
		//glTranslatef(x, y, 0);
		glBegin(GL_QUADS);
		//glTexCoord2f(x, y);
		glVertex2f(x,y);
		//glTexCoord2f(x+50, y);
		glVertex2f(x+50,y);
		//glTexCoord2f(x+50, y+50);
		glVertex2f(x+50,y+50);
		//glTexCoord2f(x, y+50);
		glVertex2f(x,y+50);
		glLoadIdentity();
		glEnd();
	}
}
