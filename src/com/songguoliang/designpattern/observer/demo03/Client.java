package com.songguoliang.designpattern.observer.demo03;

public class Client {
	public static void main(String[] args) {
		//ǰ̨С��ͯ�ӆ�
		Subject tongzizhe=new Boss();
		StockObserver tongshi1=new StockObserver("κ���",tongzizhe);
		NBAObserver tongshi2=new NBAObserver("�׹ܲ�",tongzizhe);
		
		tongzizhe.attach(tongshi1);
		tongzizhe.attach(tongshi2);
		
		tongzizhe.setState("�ϰ�����ˣ�");
		
		tongzizhe.sendNotify();
		
	}
}

