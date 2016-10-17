package com.songguoliang.designpattern.observer.demo02;

public abstract class Observer {
	private String name;
	private Secretary sub;
	public Observer(String name, Secretary sub) {
		this.name = name;
		this.sub = sub;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Secretary getSub() {
		return sub;
	}

	public void setSub(Secretary sub) {
		this.sub = sub;
	}

	public abstract void update();
}

