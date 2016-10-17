package com.songguoliang.designpattern.abstractfactory.demo03;

public class AccessDepartmentDao implements IDepartmentDao{
	@Override
	public void insert(Department department) {
		System.out.println("在Access中给Department表增加一条记录");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("在Access中根据id得到Department一条记录");
		return null;
	}
}

