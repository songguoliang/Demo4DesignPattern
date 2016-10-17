package com.songguoliang.designpattern.state.demo01;

public class ConcreteStateA implements State{

	@Override
	public void handle(Context context) {
		context.setState(new ConcreteStateB());
	}
	
}

