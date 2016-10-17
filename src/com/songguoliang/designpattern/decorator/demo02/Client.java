package com.songguoliang.designpattern.decorator.demo02;

import com.songguoliang.designpattern.decorator.demo01.Person;

public class Client {
	public static void main(String[] args) {
		Person xc=new Person("小菜");
		
		System.out.println("第一种装扮：");
		Finery dtx=new TShirts();
		dtx.show();
		
		System.out.println("第二种装扮：");
		Finery kk=new BigTrouser();
		kk.show();
		
	}
}

