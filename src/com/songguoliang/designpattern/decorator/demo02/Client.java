package com.songguoliang.designpattern.decorator.demo02;

import com.songguoliang.designpattern.decorator.demo01.Person;

public class Client {
	public static void main(String[] args) {
		Person xc=new Person("С��");
		
		System.out.println("��һ��װ�磺");
		Finery dtx=new TShirts();
		dtx.show();
		
		System.out.println("�ڶ���װ�磺");
		Finery kk=new BigTrouser();
		kk.show();
		
	}
}

