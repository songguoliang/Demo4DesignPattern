package com.songguoliang.designpattern.strategy.demo03;

public class Context {
	private IStrategy strategy;
	/**
	 * ���캯������Ҫʹ���ĸ����
	 * @date 2016-07-07 17:45:03
	 * @author sgl
	 * @param strategy
	 */
	public Context(IStrategy strategy){
		this.strategy=strategy;
	}
	/**
	 * ʹ�ü�ı�ˣ����ҳ�����
	 * @date 2016-07-07 17:45:20
	 * @author sgl
	 */
	public void operate(){
		strategy.operate();
	}
}

