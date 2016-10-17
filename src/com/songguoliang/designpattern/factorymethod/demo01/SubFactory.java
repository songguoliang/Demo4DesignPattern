package com.songguoliang.designpattern.factorymethod.demo01;

public class SubFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationSub();
	}

}

