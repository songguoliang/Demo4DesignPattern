package com.songguoliang.designpattern.factorymethod1.demo03;

public class YellowHumanFactory extends AbstractHumanFactory{

	@Override
	public Human createHuman() {
		return new YellowHuman();
	}

}

