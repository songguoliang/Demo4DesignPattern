package com.songguoliang.designpattern.simplefactory.demo04;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("����������a��");
			double numA=sc.nextDouble();
			System.out.println("��ѡ���������(+��-��*��/)��");
			String operate=sc.next();
			System.out.println("����������b��");
			double numB=sc.nextDouble();
			
			Operation o=OperationFactory.createOperate(operate);
			o.setNumA(numA);
			o.setNumB(numB);
			double result=o.getResult();
			System.out.println("����ǣ�"+result);
		} catch (Exception e) {
			System.out.println("���������д�"+e.getMessage());
		}
		
		
	}
}

