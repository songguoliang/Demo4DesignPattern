package com.songguoliang.designpattern.adapter.demo02;

public class Client {
	public static void main(String[] args) {
		Player b=new Forwards("�͵ٶ�");
		b.attack();
		Player m=new Guards("��˸��׵�");
		m.attack();
		
		Player ym=new Translate("Ҧ��");
		ym.attack();
		ym.defense();
	}
}

