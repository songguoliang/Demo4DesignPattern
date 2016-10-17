package com.songguoliang.designpattern.state.demo02;

public class EveningState implements State {

	@Override
	public void writeProgram(Work work) {
		if(work.isFinish()){
			work.setState(new RestState());
			work.writeProgram();
		}else{
			if(work.getHour()<21){
				System.out.println("��ǰʱ�䣺"+work.getHour()+"�� �Ӱ�Ŷ ƣ��֮��");
			}else{
				work.setState(new SleepingState());
				work.writeProgram();
			}
			
		}
	}

}

