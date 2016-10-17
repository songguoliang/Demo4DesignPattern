package com.songguoliang.designpattern.simplefactory.demo02;

import java.util.Scanner;
/**
 * 简易计算器第二版
 * 问题：
 * 1、没有面向对象
 * @date 2016-07-04 15:05:29
 * @author sgl
 */
public class Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数字a：");
		double numA=sc.nextDouble();
		System.out.println("请选择运算符号(+、-、*、/)：");
		String operate=sc.next();
		System.out.println("请输入数字b：");
		double numB=sc.nextDouble();
		
		double result=0;
		String errorMsg=null;
		if("+".equals(operate)){
			result=numA+numB;
		}else if("-".equals(operate)){
			result=numA-numB;
		}else if("*".equals(operate)){
			result=numA*numB;
		}else if("/".equals(operate)){
			if(numB==0){
				errorMsg="除数不能为0";
			}else{
				result=numA/numB;
			}
		}
		System.out.println("结果是："+(errorMsg==null?result:errorMsg));
	}
}

