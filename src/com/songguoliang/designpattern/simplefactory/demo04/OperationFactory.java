package com.songguoliang.designpattern.simplefactory.demo04;
/**
 * 简单工厂提供一个静态的方法，该方法根据传入的参数创建实现类
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

