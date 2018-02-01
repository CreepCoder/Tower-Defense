package com.enemies;

public class EnemyType {
	private String name;

	EnemyType(String name) {
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static EnemyType land = new EnemyType("Land");
}
