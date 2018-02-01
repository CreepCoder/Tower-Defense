package com.tiles;

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
		this.setX(x);
		this.setY(y);
		this.setWidth(width);
		this.setHeight(height);
		this.setType(type);
		this.setTexture(TextureQuickLoader.LoadTexture(type.textureName, "PNG"));
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Texture getTexture() {
		return texture;
	}

	public void setTexture(Texture texture) {
		this.texture = texture;
	}

	public TileType getType() {
		return type;
	}

	public void setType(TileType type) {
		this.type = type;
	}
}
