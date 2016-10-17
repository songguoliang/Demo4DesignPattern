package com.songguoliang.designpattern.adapter.demo02;

public class Guards extends Player{

	public Guards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("����"+getName()+"����");
	}

	@Override
	public void defense() {
		System.out.println("����"+getName()+"����");
	}

}

