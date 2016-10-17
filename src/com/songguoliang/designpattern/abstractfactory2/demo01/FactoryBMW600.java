package com.songguoliang.designpattern.abstractfactory2.demo01;

public class FactoryBMW600 implements AbstractFactory{

	@Override
	public Engine createEngine() {
		return new EngineC();
	}

	@Override
	public Aircondition createAircondition() {
		return new AirconditionC();
	}
	
}

