package com.songguoliang.designpattern.factorymethod1.demo02;

public class NvWa {
	public static void main(String[] args) {
		System.out.println("---����ĵ�һ�����ǰ�ɫ����---");
		Human whiteHuman=HumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println("---����ĵڶ������Ǻ�ɫ����---");
		Human blackHuman=HumanFactory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		
		System.out.println("---����ĵ��������ǻ�ɫ����---");
		Human yellowHuman=HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}

