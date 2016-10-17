package com.songguoliang.designpattern.chain.demo01;

public class Client {
	public static void main(String[] args) {
		Handler h1=new ConcreteHandler1();
		Handler h2=new ConcreteHandler2();
		Handler h3=new ConcreteHandler3();
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		
		int[]requests={2,5,14,22,18,3,27,20};
		for(int num:requests){
			h1.handleRequest(num);
		}
		
	}
}

