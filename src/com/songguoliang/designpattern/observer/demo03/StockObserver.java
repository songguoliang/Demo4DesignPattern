package com.songguoliang.designpattern.observer.demo03;

public class StockObserver extends Observer{
	public StockObserver(String name, Subject sub) {
		super(name, sub);
	}

	public void update(){
		System.out.println(getSub().getState()+" "+getName()+" 关闭股票行情，继续工作");
	}
	
}

