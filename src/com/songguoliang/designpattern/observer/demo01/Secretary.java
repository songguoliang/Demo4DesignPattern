package com.songguoliang.designpattern.observer.demo01;

import java.util.ArrayList;
import java.util.List;

public class Secretary {
	private List<StockObserver>observers=new ArrayList<StockObserver>();
	private String action;
	
	public void attach(StockObserver observer){
		observers.add(observer);
	}
	
	public void sendNotify(){
		for(StockObserver o:observers){
			o.update();
		}
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	
}

