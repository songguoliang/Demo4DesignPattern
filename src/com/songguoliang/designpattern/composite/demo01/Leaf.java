package com.songguoliang.designpattern.composite.demo01;

public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		System.out.println("cannot add to a leaf");
	}

	@Override
	public void remove(Component c) {
		System.out.println("cannot remove from a leaf");
	}

	@Override
	public void display(int depth) {
		StringBuffer sb=new StringBuffer("");
		for(int i=0;i<depth;i++){
			sb.append("-");
		}
		System.out.println(sb.toString()+getName());
	}

}

