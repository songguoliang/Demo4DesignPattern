package com.songguoliang.designpattern.simplefactory.demo04;

public class OperationAdd extends Operation{

	@Override
	public double getResult() {
		return getNumA()+getNumB();
	}
	
}

