package com.songguoliang.designpattern.factorymethod1.demo01;

public class HumanFactory extends AbstractHumanFactory{

	@Override
	public <T extends Human> T createHuman(Class<T> c) {
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

