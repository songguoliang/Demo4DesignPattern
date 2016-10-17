package com.songguoliang.designpattern.factorymethod.demo01;

public class OperationMul extends Operation{

	@Override
	public double getResult() {
		return getNumA()*getNumB();
	}

}

