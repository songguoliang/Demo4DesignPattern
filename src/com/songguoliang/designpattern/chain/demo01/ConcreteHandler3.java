package com.songguoliang.designpattern.chain.demo01;


public class ConcreteHandler3 extends Handler{

	@Override
	public void handleRequest(int request) {
		if(request>=20&&request<30){
			System.out.println(this.getClass().getName()+"´¦ÀíÇëÇó"+request);
		}else if(getSuccessor()!=null){
			getSuccessor().handleRequest(request);
		}
		
	}
	
}

