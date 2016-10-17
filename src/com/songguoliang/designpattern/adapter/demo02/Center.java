package com.songguoliang.designpattern.adapter.demo02;

public class Center extends Player{

	public Center(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("�з�"+getName()+"����");
	}

	@Override
	public void defense() {
		System.out.println("�з�"+getName()+"����");
	}

}

