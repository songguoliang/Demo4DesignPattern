package com.songguoliang.designpattern.decorator.demo04;

public class Client {
	public static void main(String[] args) {
		Person xc=new Person("小菜");
		System.out.println("第一种装扮：");
		TShirts dtx=new TShirts();
		dtx.decorate(xc);
		BigTrouser kk=new BigTrouser();
		kk.decorate(dtx);
		kk.show();
	}
}

