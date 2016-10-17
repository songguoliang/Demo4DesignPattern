package com.songguoliang.designpattern.strategy.demo04;

public class Context {
	//�������
	private Strategy strategy=null;
	//���캯�����þ������
	public Context(Strategy strategy){
		this.strategy=strategy;
	}
	/**
	 * ��װ��Ĳ��Է���
	 * @date 2016-07-07 18:41:02
	 * @author sgl
	 */
	public void doAnything(){
		strategy.doSomething();
	}
}

