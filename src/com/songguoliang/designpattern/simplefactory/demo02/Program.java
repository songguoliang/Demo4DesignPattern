package com.songguoliang.designpattern.simplefactory.demo02;

import java.util.Scanner;
/**
 * ���׼������ڶ���
 * ���⣺
 * 1��û���������
 * @date 2016-07-04 15:05:29
 * @author sgl
 */
public class Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����������a��");
		double numA=sc.nextDouble();
		System.out.println("��ѡ���������(+��-��*��/)��");
		String operate=sc.next();
		System.out.println("����������b��");
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
				errorMsg="��������Ϊ0";
			}else{
				result=numA/numB;
			}
		}
		System.out.println("����ǣ�"+(errorMsg==null?result:errorMsg));
	}
}

