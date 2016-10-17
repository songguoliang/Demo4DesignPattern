package com.songguoliang.designpattern.decorator.demo04;

public class Finery extends Person{
	private Person component;
	
	public void decorate(Person component){
		this.component=component;
	}
	
	public void show(){
		if(component!=null){
			component.show();
		}
	}
	
}

