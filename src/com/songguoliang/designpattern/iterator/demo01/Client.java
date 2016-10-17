package com.songguoliang.designpattern.iterator.demo01;

public class Client {
	public static void main(String[] args) {
		ConcreteAggregate a=new ConcreteAggregate();
		a.add(0,"����");
		a.add(1,"С��");
		a.add(2,"����");
		a.add(3,"����");
		
		Iterator i=new ConcreteIterator(a);
		Object item=i.first();
		while(!i.isDone()){
			System.out.println(i.currentItem()+"����Ʊ");
			i.next();
		}
		
	}
}

