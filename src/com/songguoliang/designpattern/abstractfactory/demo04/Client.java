package com.songguoliang.designpattern.abstractfactory.demo04;

public class Client {
	public static void main(String[] args) {
		User user=new User();
		Department department=new Department();
		IUserDao iUserDao=DataAccess.createUserDao();
		iUserDao.insert(user);
		iUserDao.getUser(1);
		IDepartmentDao iDepartmentDao=DataAccess.createDepartmentDao();
		iDepartmentDao.insert(department);
		iDepartmentDao.getDepartment(1);
	}
}

