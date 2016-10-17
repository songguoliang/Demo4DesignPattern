package com.songguoliang.designpattern.command.demo01;

public class ConcreteCommand extends Command{

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		getReceiver().action();
	}

}

