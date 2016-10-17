package com.songguoliang.designpattern.composite.demo02;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company{
	private List<Company>children=new ArrayList<Company>();
	public ConcreteCompany(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
		children.add(c);
	}

	@Override
	public void remove(Company c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		StringBuffer sb=new StringBuffer("");
		for(int i=0;i<depth;i++){
			sb.append("-");
		}
		System.out.println(sb.toString()+getName());
		for(Company c:children){
			c.display(depth+2);
		}
	}

	@Override
	public void lineOfDuty() {
		for(Company c:children){
			c.lineOfDuty();
		}
	}

}

