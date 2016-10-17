package com.songguoliang.designpattern.proxy.demo02;

public class Client {
	public static void main(String[] args) {
		SchoolGirl jiaojiao=new SchoolGirl();
		jiaojiao.setName("¿ÓΩøΩø");
		
		Proxy zhuojiayi=new Proxy(jiaojiao);
		zhuojiayi.giveDolls();
		zhuojiayi.giveFlowers();
		zhuojiayi.giveChocolate();
		
	}
}


