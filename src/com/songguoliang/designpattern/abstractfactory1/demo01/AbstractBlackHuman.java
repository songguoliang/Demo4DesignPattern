package com.songguoliang.designpattern.abstractfactory1.demo01;

public abstract class AbstractBlackHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("��ɫ���ֵ�Ƥ����ɫ�Ǻ�ɫ��");
	}

	@Override
	public void talk() {
		System.out.println("���˻�˵����һ����������");
	}
	
}

