package com.songguoliang.designpattern.bridge.demo01;

public class ConcreteImplementorB implements Implementor{

	@Override
	public void operation() {
		System.out.println("具体实现B的方法执行");
	}

}

