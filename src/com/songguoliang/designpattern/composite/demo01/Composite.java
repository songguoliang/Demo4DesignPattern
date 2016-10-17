package com.songguoliang.designpattern.composite.demo01;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
	private List<Component>children=new ArrayList<Component>();
	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		StringBuffer sb=new StringBuffer("");
		for(int i=0;i<depth;i++){
			sb.append("-");
		}
		System.out.println(sb.toString()+getName());
		for(Component c:children){
			c.display(depth+2);
		}
		
	}

}

