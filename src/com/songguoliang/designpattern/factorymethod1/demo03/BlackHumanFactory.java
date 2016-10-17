package com.songguoliang.designpattern.factorymethod1.demo03;

public class BlackHumanFactory extends AbstractHumanFactory{

	@Override
	public Human createHuman() {
		return new BlackHuman();
	}

}

