package com.songguoliang.designpattern.strategy.demo01;

public class ArrayHandler {
	private Sort sortObj;
	public void sort(){
		sortObj.sort();
	}
	public void setSortObj(Sort sortObj){
		this.sortObj=sortObj;
	}
}

