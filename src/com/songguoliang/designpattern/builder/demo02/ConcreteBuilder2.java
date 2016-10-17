package com.songguoliang.designpattern.builder.demo02;

public class ConcreteBuilder2 implements Builder{
	private Product product=new Product();

	@Override
	public void buildPartA() {
		product.add("����X");
	}

	@Override
	public void buildPartB() {
		product.add("����Y");
	}

	@Override
	public Product getResult() {
		return product;
	}
	
}

