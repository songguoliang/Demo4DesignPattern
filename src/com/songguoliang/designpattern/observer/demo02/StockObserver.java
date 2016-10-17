package com.songguoliang.designpattern.observer.demo02;

public class StockObserver extends Observer{
	public StockObserver(String name, Secretary sub) {
		super(name, sub);
	}

	public void update(){
		System.out.println(getSub().getAction()+" "+getName()+" 关闭股票行情，继续工作");
	}
	
}

