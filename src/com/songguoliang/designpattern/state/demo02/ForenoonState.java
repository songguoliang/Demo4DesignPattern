package com.songguoliang.designpattern.state.demo02;

public class ForenoonState implements State {

	@Override
	public void writeProgram(Work work) {
		if(work.getHour()<12){
			System.out.println("��ǰʱ�䣺"+work.getHour()+"�� ���繤�� ����ٱ�");
		}else{
			work.setState(new NoonState());
			work.writeProgram();
		}
	}

}

