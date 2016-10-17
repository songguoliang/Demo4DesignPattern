package com.songguoliang.designpattern.bridge.demo01;

public class RefineAbstraction extends Abstraction{

	public RefineAbstraction(Implementor implementor) {
		super(implementor);
	}

	@Override
	public void operation() {
		getImplementor().operation();
	}

}

