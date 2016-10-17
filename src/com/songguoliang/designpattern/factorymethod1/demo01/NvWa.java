package com.songguoliang.designpattern.factorymethod1.demo01;

public class NvWa {
	public static void main(String[] args) {
		AbstractHumanFactory yinYangLu=new HumanFactory();
		System.out.println("---����ĵ�һ�����ǰ�ɫ����---");
		Human whiteHuman=yinYangLu.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println("---����ĵڶ������Ǻ�ɫ����---");
		Human blackHuman=yinYangLu.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		
		System.out.println("---����ĵ��������ǻ�ɫ����---");
		Human yellowHuman=yinYangLu.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}

