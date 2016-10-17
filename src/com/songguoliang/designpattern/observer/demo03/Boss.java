package com.songguoliang.designpattern.observer.demo03;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Subject{
	private List<Observer>observers=new ArrayList<Observer>();
	private String action;
	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void sendNotify() {
		for(Observer o:observers){
			o.update();
		}
	}

	@Override
	public String getState() {
		return action;
	}

	@Override
	public void setState(String state) {
		this.action=state;
	}

	

}

