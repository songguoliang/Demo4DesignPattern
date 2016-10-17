package com.songguoliang.designpattern.observer.demo03;

public class Client {
	public static void main(String[] args) {
		//前台小姐童子喆
		Subject tongzizhe=new Boss();
		StockObserver tongshi1=new StockObserver("魏关姹",tongzizhe);
		NBAObserver tongshi2=new NBAObserver("易管查",tongzizhe);
		
		tongzizhe.attach(tongshi1);
		tongzizhe.attach(tongshi2);
		
		tongzizhe.setState("老板回来了！");
		
		tongzizhe.sendNotify();
		
	}
}

