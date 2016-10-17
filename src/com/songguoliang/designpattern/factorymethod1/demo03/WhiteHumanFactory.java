package com.songguoliang.designpattern.factorymethod1.demo03;

public class WhiteHumanFactory extends AbstractHumanFactory{

	@Override
	public Human createHuman() {
		return new WhiteHuman();
	}

}

