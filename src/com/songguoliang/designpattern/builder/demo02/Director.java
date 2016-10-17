package com.songguoliang.designpattern.builder.demo02;

public class Director {
	public void construct(Builder builder){
		builder.buildPartA();
		builder.buildPartB();
	}
}

