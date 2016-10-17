package com.songguoliang.designpattern.adapter.demo01;

public class Adapter extends Target{
	public Adaptee adaptee=new Adaptee();

	@Override
	public void request() {
		adaptee.specificRequest();
	}
}

