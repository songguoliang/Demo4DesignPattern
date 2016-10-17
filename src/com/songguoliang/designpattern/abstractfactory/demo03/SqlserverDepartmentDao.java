package com.songguoliang.designpattern.abstractfactory.demo03;

public class SqlserverDepartmentDao implements IDepartmentDao{

	@Override
	public void insert(Department department) {
		System.out.println("��sqlserver�и�Department������һ����¼");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("��sqlserver�и���id�õ�Departmentһ����¼");
		return null;
	}

}

