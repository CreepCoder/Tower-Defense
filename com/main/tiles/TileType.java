package com.main.tiles;

public enum TileType {
	
	Grass("grass.png", true), Dirt("dirt.png", false);
	
	String textureName;
	boolean buildable;
	TileType(String textureName, boolean buildable) {
		this.textureName = textureName;
		this.buildable = buildable;
	}
}