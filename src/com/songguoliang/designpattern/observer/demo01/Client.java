package com.songguoliang.designpattern.observer.demo01;

public class Client {
	public static void main(String[] args) {
		//ǰ̨С��ͯ�ӆ�
		Secretary tongzizhe=new Secretary();
		StockObserver tongshi1=new StockObserver("κ���",tongzizhe);
		StockObserver tongshi2=new StockObserver("�׹ܲ�",tongzizhe);
		
		tongzizhe.attach(tongshi1);
		tongzizhe.attach(tongshi2);
		
		tongzizhe.setAction("�ϰ�����ˣ�");
		
		tongzizhe.sendNotify();
		
	}
}

