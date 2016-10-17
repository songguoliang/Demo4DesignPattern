package com.songguoliang.designpattern.templatemethod.demo01;

public abstract class AbstractClass {
	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
	
	public void templateMethod(){
		System.out.println("ģ�巽������");
		primitiveOperation1();
		primitiveOperation2();
	}
}

