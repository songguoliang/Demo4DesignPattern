package com.songguoliang.designpattern.state.demo02;

public class RestState implements State {

	@Override
	public void writeProgram(Work work) {
		System.out.println("��ǰʱ�䣺"+work.getHour()+"�� �°�ؼ���");
	}

}
