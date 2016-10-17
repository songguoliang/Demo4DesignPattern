package com.songguoliang.designpattern.factorymethod1.demo01;

public abstract class AbstractHumanFactory {
	public abstract <T extends Human> T createHuman(Class<T>c);
}

