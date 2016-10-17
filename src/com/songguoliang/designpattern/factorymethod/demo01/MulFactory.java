package com.songguoliang.designpattern.factorymethod.demo01;

public class MulFactory implements IFactory{

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}

}

