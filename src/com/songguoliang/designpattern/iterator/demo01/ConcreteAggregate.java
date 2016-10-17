package com.songguoliang.designpattern.iterator.demo01;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate{
	private List<Object>items=new ArrayList<Object>();

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}
	
	public int count(){
		return items.size();
	}
	
	public Object get(int i){
		return items.get(i);
	}
	public void add(int index, Object element){
		items.add(index, element);
	}
}

