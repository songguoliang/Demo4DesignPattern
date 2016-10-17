package com.songguoliang.designpattern.iterator.demo01;

public interface Iterator {
	Object first();
	Object next();
	boolean isDone();
	Object currentItem();
}

