package com.songguoliang.designpattern.adapter.demo02;

public class Forwards extends Player{

	public Forwards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("Ç°·æ"+getName()+"½ø¹¥");
	}

	@Override
	public void defense() {
		System.out.println("Ç°·æ"+getName()+"·ÀÊØ");
	}

}

