package com.songguoliang.designpattern.builder.demo01;

public class Client {
	public static void main(String[] args) {
		PersonBuilder pb=new PersonThinBuilder();
		PersonDirector pd=new PersonDirector(pb);
		pd.createPersion();
		
	}
}

