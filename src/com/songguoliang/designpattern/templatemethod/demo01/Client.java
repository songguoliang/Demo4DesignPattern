package com.songguoliang.designpattern.templatemethod.demo01;

public class Client {
	public static void main(String[] args) {
		AbstractClass c=new ConcreteClassA();
		c.templateMethod();
		c=new ConcreteClassB();
		c.templateMethod();
		
	}
}

