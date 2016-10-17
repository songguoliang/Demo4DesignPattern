package com.songguoliang.designpattern.simplefactory.demo01;

import java.util.Scanner;
/**
 * 简易计算器第一版
 * 问题：
 * 1、命名不规范
 * 2、分支多做无用的判断
 * 3、除数为0时未处理
 * @date 2016-07-04 15:05:29
 * @author sgl
 */
public class Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数字a：");
		//采用a/b/c命名 ，不规范
		double a=sc.nextDouble();
		System.out.println("请选择运算符号(+、-、*、/)：");
		String b=sc.next();
		System.out.println("请输入数字b：");
		double c=sc.nextDouble();
		
		double d=0;
		//判断分支，加减乘除都要判断，多做三次无用的判断
		if("+".equals(b)){
			d=a+c;
		}
		if("-".equals(b)){
			d=a-c;
		}
		if("*".equals(b)){
			d=a*c;
		}
		if("/".equals(b)){
			//未处理除数为0的情况
			d=a/c;
		}
		System.out.println("结果是："+d);
	}
}

