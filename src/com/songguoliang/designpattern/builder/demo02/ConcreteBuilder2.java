package com.songguoliang.designpattern.builder.demo02;

public class ConcreteBuilder2 implements Builder{
	private Product product=new Product();

	@Override
	public void buildPartA() {
		product.add("部件X");
	}

	@Override
	public void buildPartB() {
		product.add("部件Y");
	}

	@Override
	public Product getResult() {
		return product;
	}
	
}

