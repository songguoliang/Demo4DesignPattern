package com.songguoliang.designpattern.decorator.demo03;

public class ConcreteDecoratorA extends Decorator{
	private String addedState;

	@Override
	public void operation() {
		super.operation();
		addedState="new State";
		System.out.println("����װ�ζ���A�Ĳ���");
	}
	
}

