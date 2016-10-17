package com.songguoliang.designpattern.adapter.demo02;

public class Translate extends Player{
	private ForeignCenter wjzf=new ForeignCenter();
	public Translate(String name) {
		super(name);
		wjzf.setName(name);
	}

	@Override
	public void attack() {
		wjzf.进攻();
	}

	@Override
	public void defense() {
		wjzf.防守();
	}

}

