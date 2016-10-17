package com.songguoliang.designpattern.command.demo01;

public abstract class Command {
	private Receiver receiver;

	public Command(Receiver receiver) {
		this.receiver = receiver;
	}
	public abstract void execute();
	public Receiver getReceiver() {
		return receiver;
	}
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
	
}

