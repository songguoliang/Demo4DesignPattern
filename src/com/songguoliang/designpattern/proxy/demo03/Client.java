package com.songguoliang.designpattern.proxy.demo03;

public class Client {
	public static void main(String[] args) {
		SchoolGirl jiaojiao=new SchoolGirl();
		jiaojiao.setName("¿ÓΩøΩø");
		
		Proxy daili=new Proxy(jiaojiao);
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
		
	}
}


