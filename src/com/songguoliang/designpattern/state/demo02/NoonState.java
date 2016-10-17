package com.songguoliang.designpattern.state.demo02;

public class NoonState implements State {

	@Override
	public void writeProgram(Work work) {
		if(work.getHour()<13){
			System.out.println("��ǰʱ�䣺"+work.getHour()+"�� ���� �緹 ���� ����");
		}else{
			work.setState(new AfternoonState());
			work.writeProgram();
		}
	}

}

