package com.songguoliang.designpattern.decorator.demo03;

public class ConcreteDecoratorB extends Decorator{
	@Override
	public void operation() {
		super.operation();
		addedBehavior();
		System.out.println("����װ�ζ���A�Ĳ���");
	}

	private void addedBehavior() {
		
	}
	
}

