package com.songguoliang.designpattern.builder.demo01;

public class PersonDirector {
	private PersonBuilder pb;
	public PersonDirector(PersonBuilder pb){
		this.pb=pb;
	}
	public void createPersion(){
		pb.buildHead();
		pb.buildBody();
		pb.buildArmLeft();
		pb.buildArmRight();
		pb.buildLegLeft();
		pb.buildLegRight();
	}
	
}

