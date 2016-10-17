package com.songguoliang.designpattern.abstractfactory.demo03;

public interface IFactory {
	IUserDao createUserDao();
	IDepartmentDao createDepartmentDao();
}

