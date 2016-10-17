package com.songguoliang.designpattern.adapter.demo01;

public class Client {
	public static void main(String[] args) {
		Target target=new Adapter();
		target.request();
		
	}
	
	
}

