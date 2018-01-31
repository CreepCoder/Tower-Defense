package com.main.tiles;

import org.newdawn.slick.opengl.Texture;

import com.main.methods.TextureQuickLoader;

public class Tile {
	private int x;
	private int y;
	private int width;
	private int height;
	private Texture texture;
	private TileType type;
	
	public Tile(int x, int y, int width, int height, TileType type) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.type = type;
		this.texture = TextureQuickLoader.LoadTexture(type.textureName, "PNG");
	}
}
