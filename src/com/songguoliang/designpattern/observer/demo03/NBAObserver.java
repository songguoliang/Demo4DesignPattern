package com.songguoliang.designpattern.observer.demo03;

public class NBAObserver extends Observer{
	public NBAObserver(String name, Subject sub) {
		super(name, sub);
	}

	public void update(){
		System.out.println(getSub().getState()+" "+getName()+" �ر�NBAֱ������������");
	}
	
}

