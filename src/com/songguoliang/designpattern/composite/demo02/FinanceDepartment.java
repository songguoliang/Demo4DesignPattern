package com.songguoliang.designpattern.composite.demo02;

public class FinanceDepartment extends Company{

	public FinanceDepartment(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
		
	}

	@Override
	public void remove(Company c) {
		
	}

	@Override
	public void display(int depth) {
		StringBuffer sb=new StringBuffer("");
		for(int i=0;i<depth;i++){
			sb.append("-");
		}
	}

	@Override
	public void lineOfDuty() {
		System.out.println(getName()+" 公司财务收支管理");
	}

}

