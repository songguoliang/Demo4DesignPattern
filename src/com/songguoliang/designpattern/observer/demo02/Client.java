package com.songguoliang.designpattern.observer.demo02;

public class Client {
	public static void main(String[] args) {
		//ǰ̨С��ͯ�ӆ�
		Secretary tongzizhe=new Secretary();
		StockObserver tongshi1=new StockObserver("κ���",tongzizhe);
		NBAObserver tongshi2=new NBAObserver("�׹ܲ�",tongzizhe);
		
		tongzizhe.attach(tongshi1);
		tongzizhe.attach(tongshi2);
		
		tongzizhe.setAction("�ϰ�����ˣ�");
		
		tongzizhe.sendNotify();
		
	}
}

