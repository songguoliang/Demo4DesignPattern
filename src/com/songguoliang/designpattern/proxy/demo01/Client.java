package com.songguoliang.designpattern.proxy.demo01;

public class Client {
	public static void main(String[] args) {
		SchoolGirl jiaojiao=new SchoolGirl();
		jiaojiao.setName("¿ÓΩøΩø");
		
		Pursuit zhuojiayi=new Pursuit(jiaojiao);
		zhuojiayi.giveDolls();
		zhuojiayi.giveFlowers();
		zhuojiayi.giveChocolate();
		
	}
}

