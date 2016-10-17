package com.songguoliang.designpattern.factorymethod1.demo02;

public class HumanFactory{

	public static <T extends Human> T createHuman(Class<T> c) {
		Human human=null;
		try {
			human = (Human)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("�������ɴ���");
			e.printStackTrace();
		}
		return (T)human;
	}

}

