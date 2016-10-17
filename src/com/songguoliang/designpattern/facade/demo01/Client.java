package com.songguoliang.designpattern.facade.demo01;

public class Client {
	public static void main(String[] args) {
		Facade facade=new Facade();
		facade.methodA();
		facade.methodB();
		
		
	}
}

