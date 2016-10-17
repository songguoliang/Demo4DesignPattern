package com.songguoliang.designpattern.builder.demo02;

public interface Builder {
	public void buildPartA();
	public void buildPartB();
	public Product getResult();
}

