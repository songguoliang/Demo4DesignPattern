package com.songguoliang.designpattern.simplefactory.demo01;

import java.util.Scanner;
/**
 * ���׼�������һ��
 * ���⣺
 * 1���������淶
 * 2����֧�������õ��ж�
 * 3������Ϊ0ʱδ����
 * @date 2016-07-04 15:05:29
 * @author sgl
 */
public class Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����������a��");
		//����a/b/c���� �����淶
		double a=sc.nextDouble();
		System.out.println("��ѡ���������(+��-��*��/)��");
		String b=sc.next();
		System.out.println("����������b��");
		double c=sc.nextDouble();
		
		double d=0;
		//�жϷ�֧���Ӽ��˳���Ҫ�жϣ������������õ��ж�
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
			//δ�������Ϊ0�����
			d=a/c;
		}
		System.out.println("����ǣ�"+d);
	}
}

