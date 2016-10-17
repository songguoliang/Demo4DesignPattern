package com.songguoliang.designpattern.abstractfactory1.demo01;

public interface Human {
	/**
	 * 每个人种的皮肤都有相应的颜色
	 * @date 2016-07-05 15:18:22
	 * @author sgl
	 */
	public void getColor();
	/**
	 * 人类会说话
	 * @date 2016-07-05 15:18:10
	 * @author sgl
	 */
	public void talk();
	/**
	 * 每个人都有性别
	 * @date 2016-07-05 16:04:08
	 * @author sgl
	 */
	public void getSex();
}

