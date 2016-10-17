package com.songguoliang.designpattern.templatemethod.demo01;

public abstract class AbstractClass {
	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
	
	public void templateMethod(){
		System.out.println("模板方法内容");
		primitiveOperation1();
		primitiveOperation2();
	}
}

