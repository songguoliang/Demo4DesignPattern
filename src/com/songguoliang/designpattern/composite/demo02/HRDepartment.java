package com.songguoliang.designpattern.composite.demo02;

public class HRDepartment extends Company{

	public HRDepartment(String name) {
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
		System.out.println(getName()+" 员工招聘培训管理");
	}

}

