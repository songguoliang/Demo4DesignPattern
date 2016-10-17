package com.songguoliang.designpattern.iterator.demo01;

public class ConcreteIterator implements Iterator{
	private ConcreteAggregate aggregate;
	private int current=0;
	
	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		return aggregate.get(0);
	}

	@Override
	public Object next() {
		current++;
		if(current<aggregate.count()){
			return aggregate.get(current);
		}
		return null;
	}

	@Override
	public boolean isDone() {
		return current>=aggregate.count();
	}

	@Override
	public Object currentItem() {
		return aggregate.get(current);
	}

}

