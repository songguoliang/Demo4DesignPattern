package com.songguoliang.designpattern.abstractfactory.demo03;

public class Client {
	public static void main(String[] args) {
		User user=new User();
		Department department=new Department();
		
		IFactory iFactory=new SqlserverFactory();
		IUserDao iUserDao=iFactory.createUserDao();
		iUserDao.insert(user);
		iUserDao.getUser(1);
		IDepartmentDao iDepartmentDao=iFactory.createDepartmentDao();
		iDepartmentDao.insert(department);
		iDepartmentDao.getDepartment(1);
		
		
	}
}

