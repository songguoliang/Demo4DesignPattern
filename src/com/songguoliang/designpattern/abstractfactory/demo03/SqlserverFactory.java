package com.songguoliang.designpattern.abstractfactory.demo03;

public class SqlserverFactory implements IFactory{

	@Override
	public IUserDao createUserDao() {
		return new SqlserverUserDao();
	}

	@Override
	public IDepartmentDao createDepartmentDao() {
		return new SqlserverDepartmentDao();
	}
	
}

