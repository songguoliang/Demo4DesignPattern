package com.songguoliang.designpattern.state.demo02;

public class Work {
	private State current;
	private double hour;
	private boolean finish=false;
	public Work(){
		current=new ForenoonState();
	}
	public double getHour() {
		return hour;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}
	public void setState(State state) {
		this.current = state;
	}
	public boolean isFinish() {
		return finish;
	}
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	public void writeProgram(){
		current.writeProgram(this);
	}
}

