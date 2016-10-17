package com.songguoliang.designpattern.observer.demo03;

public interface Subject {
	public void attach(Observer observer);
	
	public void detach(Observer observer);
	
	public void sendNotify();
	
	public String getState(); 
	
	public void setState(String state); 
}

