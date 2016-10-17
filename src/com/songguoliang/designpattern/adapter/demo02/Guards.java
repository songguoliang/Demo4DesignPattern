package com.songguoliang.designpattern.adapter.demo02;

public class Guards extends Player{

	public Guards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("ºóÎÀ"+getName()+"½ø¹¥");
	}

	@Override
	public void defense() {
		System.out.println("ºóÎÀ"+getName()+"·ÀÊØ");
	}

}

