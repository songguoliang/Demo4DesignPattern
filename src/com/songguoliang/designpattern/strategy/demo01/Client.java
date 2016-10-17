package com.songguoliang.designpattern.strategy.demo01;

public class Client {
	public static void main(String[] args) {
		ArrayHandler ah=new ArrayHandler();
		Sort sort=new BubbleSort();
		ah.setSortObj(sort);
		ah.sort();
		
		
	}
}

