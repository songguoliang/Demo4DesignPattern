package com.songguoliang.designpattern.simplefactory.demo03;

public class Operation {
	public static double getResult(double numA,double numB,String operate){
		double result=0d;
		if("+".equals(operate)){
			result=numA+numB;
		}else if("-".equals(operate)){
			result=numA-numB;
		}else if("*".equals(operate)){
			result=numA*numB;
		}else if("/".equals(operate)){
			result=numA/numB;
		}
		return result;
	}
}

