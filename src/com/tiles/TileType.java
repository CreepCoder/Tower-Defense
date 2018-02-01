package com.tiles;

public enum TileType {
	
	Grass("tiles/grass.png", true), Dirt("tiles/dirt.png", false), Water("tiles/water.png", false);
	
	String textureName;
	boolean buildable;
	TileType(String textureName, boolean buildable) {
		this.textureName = textureName;
		this.buildable = buildable;
	}
}
