package com.songguoliang.designpattern.strategy.demo04;

public class Client {
	public static void main(String[] args) {
		Strategy strategy=new ConcreteStrategy2();
		Context context=new Context(strategy);
		context.doAnything();
	}
}

