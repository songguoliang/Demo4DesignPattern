package com.songguoliang.designpattern.decorator.demo04;

public class Person {
	private String name;
	public Person(){
		
	}
	public Person(String name){
		this.name=name;
	}
	public void show(){
		System.out.println("×°°çµÄ"+name);
	}
	
}

