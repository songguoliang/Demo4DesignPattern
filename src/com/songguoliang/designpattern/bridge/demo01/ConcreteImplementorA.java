package com.songguoliang.designpattern.bridge.demo01;

public class ConcreteImplementorA implements Implementor{

	@Override
	public void operation() {
		System.out.println("具体实现A的方法执行");
	}

}

