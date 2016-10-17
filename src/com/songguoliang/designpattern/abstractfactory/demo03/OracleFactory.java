package com.songguoliang.designpattern.abstractfactory.demo03;

public class OracleFactory implements IFactory{

	@Override
	public IUserDao createUserDao() {
		return new OracleUserDao();
	}

	@Override
	public IDepartmentDao createDepartmentDao() {
		return new OracleDepartmentDao();
	}

}

