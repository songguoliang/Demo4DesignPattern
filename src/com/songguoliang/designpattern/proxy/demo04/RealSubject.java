package com.songguoliang.designpattern.proxy.demo04;

public class RealSubject implements Subject{

	@Override
	public void request() {
		System.out.println("��ʵ������");
	}

}

