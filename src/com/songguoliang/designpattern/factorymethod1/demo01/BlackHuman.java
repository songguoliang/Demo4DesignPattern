package com.songguoliang.designpattern.factorymethod1.demo01;

public class BlackHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("��ɫ���ֵ�Ƥ����ɫ�Ǻ�ɫ��");
	}

	@Override
	public void talk() {
		System.out.println("���˻�˵����һ����������");
	}
	
}

