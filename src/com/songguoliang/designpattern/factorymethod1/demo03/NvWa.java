package com.songguoliang.designpattern.factorymethod1.demo03;

public class NvWa {
	public static void main(String[] args) {
		System.out.println("---����ĵ�һ�����ǰ�ɫ����---");
		Human whiteHuman=new WhiteHumanFactory().createHuman();
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println("---����ĵڶ������Ǻ�ɫ����---");
		Human blackHuman=new BlackHumanFactory().createHuman();
		blackHuman.getColor();
		blackHuman.talk();
		
		System.out.println("---����ĵ��������ǻ�ɫ����---");
		Human yellowHuman=new YellowHumanFactory().createHuman();
		yellowHuman.getColor();
		yellowHuman.talk();
	}
}

