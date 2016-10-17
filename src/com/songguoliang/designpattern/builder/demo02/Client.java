package com.songguoliang.designpattern.builder.demo02;

public class Client {
	public static void main(String[] args) {
		Director director=new Director();
		Builder b1=new ConcreteBuilder1();
		director.construct(b1);
		Product p1=b1.getResult();
		p1.show();
		
		Builder b2=new ConcreteBuilder2();
		director.construct(b2);
		Product p2=b2.getResult();
		p2.show();
		
	}
}

