package com.songguoliang.designpattern.factorymethod.demo01;

public class AddFactory implements IFactory{

	@Override
	public Operation createOperation() {
		return new OperationAdd() ;
	}

}

