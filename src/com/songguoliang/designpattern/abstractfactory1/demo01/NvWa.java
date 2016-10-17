package com.songguoliang.designpattern.abstractfactory1.demo01;

public class NvWa {
	public static void main(String[] args) {
		HumanFactory maleHumanFactory=new MaleFactory();
		HumanFactory femaleHumanFactory=new FemaleFactory();
		
		Human maleYellowHuman=maleHumanFactory.createYellowHuman();
		Human femaleYellowHuman=femaleHumanFactory.createYellowHuman();
		System.out.println("----����һ����ɫŮ��---");
		femaleYellowHuman.getColor();
		femaleYellowHuman.talk();
		femaleYellowHuman.getSex();
		System.out.println("----����һ����ɫ����---");
		maleYellowHuman.getColor();
		maleYellowHuman.talk();
		maleYellowHuman.getSex();
		
	}
}

