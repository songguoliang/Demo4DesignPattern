package com.songguoliang.designpattern.factorymethod1.demo01;

public class WhiteHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("��ɫ���ֵ�Ƥ����ɫ�ǰ�ɫ��");
	}

	@Override
	public void talk() {
		System.out.println("��ɫ���ֻ�˵����һ�㶼��˵�ĵ��ֽ�");
	}

}

