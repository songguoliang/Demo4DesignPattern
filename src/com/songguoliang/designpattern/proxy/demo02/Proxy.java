package com.songguoliang.designpattern.proxy.demo02;

public class Proxy {
	SchoolGirl mm;
	
	public Proxy(SchoolGirl mm){
		this.mm=mm;
	}
	public void giveDolls(){
		System.out.println(mm.getName()+" ����������");
	}
	public void giveFlowers(){
		System.out.println(mm.getName()+" �����ʻ�");
	}
	public void giveChocolate(){
		System.out.println(mm.getName()+" �����ɿ���");
	}
	
}

