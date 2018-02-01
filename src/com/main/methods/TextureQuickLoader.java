package com.main.methods;

import java.io.IOException;
import java.io.InputStream;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

public class TextureQuickLoader {
	
	public static Texture LoadTexture(String path, String filetype) {
		Texture texture = null;
		InputStream in = ResourceLoader.getResourceAsStream("/src/assets/" + path);
		try {
			texture = TextureLoader.getTexture(filetype, in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return texture;
	}
}
