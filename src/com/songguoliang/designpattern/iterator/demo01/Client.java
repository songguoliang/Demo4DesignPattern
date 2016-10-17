package com.songguoliang.designpattern.iterator.demo01;

public class Client {
	public static void main(String[] args) {
		ConcreteAggregate a=new ConcreteAggregate();
		a.add(0,"大鸟");
		a.add(1,"小菜");
		a.add(2,"行李");
		a.add(3,"老外");
		
		Iterator i=new ConcreteIterator(a);
		Object item=i.first();
		while(!i.isDone()){
			System.out.println(i.currentItem()+"请买票");
			i.next();
		}
		
	}
}

