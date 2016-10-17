package com.songguoliang.designpattern.chain.demo01;


public class ConcreteHandler1 extends Handler{

	@Override
	public void handleRequest(int request) {
		if(request>=0&&request<10){
			System.out.println(this.getClass().getName()+"´¦ÀíÇëÇó"+request);
		}else if(getSuccessor()!=null){
			getSuccessor().handleRequest(request);
		}
		
	}
	
}

