package com.songguoliang.designpattern.decorator.demo01;

public class Main {
	public static void main(String[] args) {
		Person xc=new Person("С��");
		System.out.println("��һ��װ�磺");
		xc.wearTShirts();
		xc.wearBigTrouser();
		xc.wearSneakers();
		xc.show();
		
		System.out.println("�ڶ���װ�磺");
		xc.wearSuit();
		xc.wearTie();
		xc.wearLeatherShoes();
		xc.show();
		
	}
}

