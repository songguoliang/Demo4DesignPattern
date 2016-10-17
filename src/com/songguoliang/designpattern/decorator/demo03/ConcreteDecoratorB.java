package com.songguoliang.designpattern.decorator.demo03;

public class ConcreteDecoratorB extends Decorator{
	@Override
	public void operation() {
		super.operation();
		addedBehavior();
		System.out.println("具体装饰对象A的操作");
	}

	private void addedBehavior() {
		
	}
	
}

