package com.songguoliang.designpattern.factorymethod.demo01;

public class OperationAdd extends Operation{

	@Override
	public double getResult() {
		return getNumA()+getNumB();
	}
	
}

