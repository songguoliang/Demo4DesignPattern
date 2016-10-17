package com.songguoliang.designpattern.factorymethod.demo01;

public class DivFactory implements IFactory{

	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}

}

