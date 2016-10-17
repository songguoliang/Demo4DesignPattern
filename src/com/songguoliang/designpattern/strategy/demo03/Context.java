package com.songguoliang.designpattern.strategy.demo03;

public class Context {
	private IStrategy strategy;
	/**
	 * 构造函数，你要使用哪个妙计
	 * @date 2016-07-07 17:45:03
	 * @author sgl
	 * @param strategy
	 */
	public Context(IStrategy strategy){
		this.strategy=strategy;
	}
	/**
	 * 使用计谋了，看我出招了
	 * @date 2016-07-07 17:45:20
	 * @author sgl
	 */
	public void operate(){
		strategy.operate();
	}
}

