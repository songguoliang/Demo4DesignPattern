package com.songguoliang.designpattern.state.demo01;

public class ConcreteStateB implements State{

	@Override
	public void handle(Context context) {
		context.setState(new ConcreteStateA());
	}

}

