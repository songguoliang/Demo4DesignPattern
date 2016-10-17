package com.songguoliang.designpattern.abstractfactory.demo04;

public interface IDepartmentDao {
	void insert(Department department);
	Department getDepartment(int id);
}

