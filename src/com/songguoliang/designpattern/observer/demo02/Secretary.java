package com.songguoliang.designpattern.observer.demo02;

import java.util.ArrayList;
import java.util.List;

public class Secretary {
	private List<Observer>observers=new ArrayList<Observer>();
	private String action;
	
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	public void detach(Observer observer){
		observers.remove(observer);
	}
	
	public void sendNotify(){
		for(Observer o:observers){
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

