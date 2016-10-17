package com.songguoliang.designpattern.decorator.demo01;

public class Main {
	public static void main(String[] args) {
		Person xc=new Person("小菜");
		System.out.println("第一种装扮：");
		xc.wearTShirts();
		xc.wearBigTrouser();
		xc.wearSneakers();
		xc.show();
		
		System.out.println("第二种装扮：");
		xc.wearSuit();
		xc.wearTie();
		xc.wearLeatherShoes();
		xc.show();
		
	}
}

