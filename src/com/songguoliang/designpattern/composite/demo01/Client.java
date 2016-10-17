package com.songguoliang.designpattern.composite.demo01;

public class Client {
	public static void main(String[] args) {
		Composite root=new Composite("root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));
		
		Composite comp=new Composite("composite x");
		comp.add(new Leaf("Leaf XA"));
		comp.add(new Leaf("Leaf XB"));
		
		root.add(comp);
		
		Composite comp2=new Composite("composite xy");
		comp2.add(new Leaf("Leaf XYA"));
		comp2.add(new Leaf("Leaf XYB"));
		
		comp.add(comp2);
		
		root.add(new Leaf("Leaf C"));
		Leaf leaf=new Leaf("Leaf D");
		root.add(leaf);
		root.remove(leaf);
		root.display(1);
		
	}
}

