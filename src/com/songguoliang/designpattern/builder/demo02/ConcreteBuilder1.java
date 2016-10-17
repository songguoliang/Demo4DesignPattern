package com.songguoliang.designpattern.builder.demo02;

public class ConcreteBuilder1 implements Builder{
	private Product product=new Product();

	@Override
	public void buildPartA() {
		product.add("����A");
	}

	@Override
	public void buildPartB() {
		product.add("����B");
	}

	@Override
	public Product getResult() {
		return product;
	}
	
}

