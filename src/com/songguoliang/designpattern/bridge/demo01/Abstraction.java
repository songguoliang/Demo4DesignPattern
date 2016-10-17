package com.songguoliang.designpattern.bridge.demo01;

public class Abstraction {
	private Implementor implementor;

	public Abstraction(Implementor implementor) {
		this.implementor = implementor;
	}
	public void operation(){
		implementor.operation();
	}
	public Implementor getImplementor() {
		return implementor;
	}
	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}
	
}

