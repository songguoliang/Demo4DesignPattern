package com.songguoliang.designpattern.singleton.demo01;

public class Emperor {
	private static final Emperor emperor=new Emperor();
	private Emperor(){}
	
	public static Emperor getInstance(){
		return emperor;
	}
	public void say(){
		System.out.println("扂憩岆銘著議議議＃＃");
	}
}

