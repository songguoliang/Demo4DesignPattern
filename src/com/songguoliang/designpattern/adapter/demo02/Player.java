package com.songguoliang.designpattern.adapter.demo02;

public abstract class Player {
	private String name;

	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void attack();
	public abstract void defense();
	
}

