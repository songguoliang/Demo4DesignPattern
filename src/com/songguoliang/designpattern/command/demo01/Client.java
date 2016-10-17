package com.songguoliang.designpattern.command.demo01;

public class Client {
	public static void main(String[] args) {
		Receiver r=new Receiver();
		Command c=new ConcreteCommand(r);
		Invoker i=new Invoker();
		
		i.setCommand(c);
		i.executeCommand();
		
	}
}

