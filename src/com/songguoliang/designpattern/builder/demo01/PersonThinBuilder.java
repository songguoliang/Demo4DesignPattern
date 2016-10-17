package com.songguoliang.designpattern.builder.demo01;

public class PersonThinBuilder implements PersonBuilder{

	@Override
	public void buildHead() {
		System.out.println("buildHead");
	}

	@Override
	public void buildBody() {
		System.out.println("buildBody");
	}

	@Override
	public void buildArmLeft() {
		System.out.println("buildArmLeft");
	}

	@Override
	public void buildArmRight() {
		System.out.println("buildArmRight");
	}

	@Override
	public void buildLegLeft() {
		System.out.println("buildLegLeft");
	}

	@Override
	public void buildLegRight() {
		System.out.println("buildLegRight");
	}

}

