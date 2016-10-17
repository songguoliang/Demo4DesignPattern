package com.songguoliang.designpattern.simplefactory.demo04;
/**
 * �򵥹����ṩһ����̬�ķ������÷������ݴ���Ĳ�������ʵ����
 * @date 2016-07-05 10:46:33
 * @author sgl
 */
public class OperationFactory {
	public static Operation createOperate(String operate){
		if("+".equals(operate)){
			return new OperationAdd();
		}else if("-".equals(operate)){
			return new OperationSub();
		}else if("*".equals(operate)){
			return new OperationMul();
		}else if("/".equals(operate)){
			return new OperationDiv();
		}else{
			return null;
		}
	}
}

