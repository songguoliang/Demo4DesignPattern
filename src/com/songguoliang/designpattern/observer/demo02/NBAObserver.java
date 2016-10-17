package com.songguoliang.designpattern.observer.demo02;

public class NBAObserver extends Observer{
	public NBAObserver(String name, Secretary sub) {
		super(name, sub);
	}

	public void update(){
		System.out.println(getSub().getAction()+" "+getName()+" 关闭NBA直播，继续工作");
	}
	
}

