package com.songguoliang.designpattern.observer.demo03;

public class StockObserver extends Observer{
	public StockObserver(String name, Subject sub) {
		super(name, sub);
	}

	public void update(){
		System.out.println(getSub().getState()+" "+getName()+" �رչ�Ʊ���飬��������");
	}
	
}

