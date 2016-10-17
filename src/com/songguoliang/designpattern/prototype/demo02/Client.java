package com.songguoliang.designpattern.prototype.demo02;

public class Client {
	public static void main(String[] args) {
		ConcretePrototype1 p1=new ConcretePrototype1("1");
		ConcretePrototype1 c1=p1.clone();
		System.out.println("cloned:"+c1.getId());
	}
}

