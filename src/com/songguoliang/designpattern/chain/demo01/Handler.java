package com.songguoliang.designpattern.chain.demo01;

public abstract class Handler {
	private Handler successor;

	public Handler getSuccessor() {
		return successor;
	}

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	public abstract void handleRequest(int request);
	
}

