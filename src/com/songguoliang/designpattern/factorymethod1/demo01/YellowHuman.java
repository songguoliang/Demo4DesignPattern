package com.songguoliang.designpattern.factorymethod1.demo01;

public class YellowHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("��ɫ���ֵ�Ƥ����ɫ�ǻ�ɫ��");
	}

	@Override
	public void talk() {
		System.out.println("��ɫ���ֻ�˵����һ��˵�Ķ���˫�ֽ�");
	}

}

