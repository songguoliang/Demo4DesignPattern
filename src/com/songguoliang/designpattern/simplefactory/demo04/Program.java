package com.songguoliang.designpattern.simplefactory.demo04;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入数字a：");
			double numA=sc.nextDouble();
			System.out.println("请选择运算符号(+、-、*、/)：");
			String operate=sc.next();
			System.out.println("请输入数字b：");
			double numB=sc.nextDouble();
			
			Operation o=OperationFactory.createOperate(operate);
			o.setNumA(numA);
			o.setNumB(numB);
			double result=o.getResult();
			System.out.println("结果是："+result);
		} catch (Exception e) {
			System.out.println("您的输入有错："+e.getMessage());
		}
		
		
	}
}

