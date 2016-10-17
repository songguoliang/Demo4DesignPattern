package com.songguoliang.designpattern.bridge.demo01;

public class Client {
	public static void main(String[] args) {
		Abstraction ab=new RefineAbstraction(new ConcreteImplementorA());
		ab.operation();
		
		ab.setImplementor(new ConcreteImplementorB());
		ab.operation();
		
	}
}

