package com.songguoliang.designpattern.abstractfactory.demo02;

public class SqlserverFactory implements IFactory{

	@Override
	public IUserDao createUserDao() {
		return new SqlserverUserDao();
	}
	
}

