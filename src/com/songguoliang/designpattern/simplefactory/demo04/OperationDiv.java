package com.songguoliang.designpattern.simplefactory.demo04;

public class OperationDiv extends Operation{

	@Override
	public double getResult() throws Exception {
		if(getNumB()==0){
			throw new Exception("除数不能为0");
		}
		return getNumA()/getNumB();
	}

}

