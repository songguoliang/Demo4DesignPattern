package com.songguoliang.designpattern.decorator.demo04;

public class Client {
	public static void main(String[] args) {
		Person xc=new Person("С��");
		System.out.println("��һ��װ�磺");
		TShirts dtx=new TShirts();
		dtx.decorate(xc);
		BigTrouser kk=new BigTrouser();
		kk.decorate(dtx);
		kk.show();
	}
}

