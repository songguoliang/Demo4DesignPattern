package com.songguoliang.designpattern.abstractfactory.demo03;

public class AccessDepartmentDao implements IDepartmentDao{
	@Override
	public void insert(Department department) {
		System.out.println("��Access�и�Department������һ����¼");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("��Access�и���id�õ�Departmentһ����¼");
		return null;
	}
}

