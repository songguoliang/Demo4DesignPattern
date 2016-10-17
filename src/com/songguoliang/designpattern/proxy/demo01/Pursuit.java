package com.songguoliang.designpattern.proxy.demo01;

public class Pursuit {
	SchoolGirl mm;
	public Pursuit(SchoolGirl mm){
		this.mm=mm;
	}
	public void giveDolls(){
		System.out.println(mm.getName()+" ËÍÄãÑóÍŞÍŞ");
	}
	public void giveFlowers(){
		System.out.println(mm.getName()+" ËÍÄãÏÊ»¨");
	}
	public void giveChocolate(){
		System.out.println(mm.getName()+" ËÍÄãÇÉ¿ËÁ¦");
	}
	
	
}

