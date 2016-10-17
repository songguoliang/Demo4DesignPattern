package com.songguoliang.designpattern.factorymethod.demo01;

public class OperationSub extends Operation{

	@Override
	public double getResult() {
		return getNumA()-getNumB();
	}
	
}

