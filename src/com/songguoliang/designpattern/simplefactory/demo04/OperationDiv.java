package com.songguoliang.designpattern.simplefactory.demo04;

public class OperationDiv extends Operation{

	@Override
	public double getResult() throws Exception {
		if(getNumB()==0){
			throw new Exception("��������Ϊ0");
		}
		return getNumA()/getNumB();
	}

}

