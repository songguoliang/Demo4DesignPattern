package com.songguoliang.designpattern.abstractfactory.demo02;

public class AccessFactory implements IFactory{

	@Override
	public IUserDao createUserDao() {
		return new AccessUserDao();
	}
	
}

