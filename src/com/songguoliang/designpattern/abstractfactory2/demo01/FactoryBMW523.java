package com.songguoliang.designpattern.abstractfactory2.demo01;

public class FactoryBMW523 implements AbstractFactory{

	@Override
	public Engine createEngine() {
		return new EngineB();
	}

	@Override
	public Aircondition createAircondition() {
		return new AirconditionB();
	}
	
}

