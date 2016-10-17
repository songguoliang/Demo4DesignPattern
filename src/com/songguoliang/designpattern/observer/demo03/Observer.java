package com.songguoliang.designpattern.observer.demo03;

public abstract class Observer {
	private String name;
	private Subject sub;
	public Observer(String name, Subject sub) {
		this.name = name;
		this.sub = sub;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}

	public abstract void update();
}

