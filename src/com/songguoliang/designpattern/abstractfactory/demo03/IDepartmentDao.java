package com.songguoliang.designpattern.abstractfactory.demo03;

public interface IDepartmentDao {
	void insert(Department department);
	Department getDepartment(int id);
}

