package com.songguoliang.designpattern.chain.demo01;


public class ConcreteHandler2 extends Handler{

	@Override
	public void handleRequest(int request) {
		if(request>=10&&request<20){
			System.out.println(this.getClass().getName()+"´¦ÀíÇëÇó"+request);
		}else if(getSuccessor()!=null){
			getSuccessor().handleRequest(request);
		}
		
	}
	
}

