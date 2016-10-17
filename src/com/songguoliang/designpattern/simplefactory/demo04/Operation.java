package com.songguoliang.designpattern.simplefactory.demo04;

public abstract class Operation {
	private double numA=0;
	private double numB=0;
	
	public abstract double getResult() throws Exception;
	
	public double getNumA() {
		return numA;
	}
	public void setNumA(double numA) {
		this.numA = numA;
	}
	public double getNumB() {
		return numB;
	}
	public void setNumB(double numB) {
		this.numB = numB;
	}
	
	
}

