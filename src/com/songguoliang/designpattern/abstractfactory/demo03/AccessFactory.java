package com.songguoliang.designpattern.abstractfactory.demo03;

public class AccessFactory implements IFactory{

	@Override
	public IUserDao createUserDao() {
		return new AccessUserDao();
	}

	@Override
	public IDepartmentDao createDepartmentDao() {
		return new AccessDepartmentDao();
	}
	
}

