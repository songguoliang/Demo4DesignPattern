package com.songguoliang.designpattern.proxy.demo03;

public class Pursuit implements GiveGift{
	SchoolGirl mm;
	public Pursuit(SchoolGirl mm){
		this.mm=mm;
	}
	
	@Override
	public void giveDolls() {
		System.out.println(mm.getName()+" ËÍÄãÑóÍŞÍŞ");
	}

	@Override
	public void giveFlowers() {
		System.out.println(mm.getName()+" ËÍÄãÏÊ»¨");
	}

	@Override
	public void giveChocolate() {
		System.out.println(mm.getName()+" ËÍÄãÇÉ¿ËÁ¦");
	}

}

