package com.songguoliang.designpattern.strategy.demo04;

public class Context {
	//抽象策略
	private Strategy strategy=null;
	//构造函数设置具体策略
	public Context(Strategy strategy){
		this.strategy=strategy;
	}
	/**
	 * 封装后的策略方法
	 * @date 2016-07-07 18:41:02
	 * @author sgl
	 */
	public void doAnything(){
		strategy.doSomething();
	}
}

