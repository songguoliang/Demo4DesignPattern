package com.songguoliang.designpattern.prototype.demo02;


public class ConcretePrototype1 implements Cloneable{
	private String id;
	public ConcretePrototype1(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public ConcretePrototype1 clone() {
		try {
			return (ConcretePrototype1)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

}

