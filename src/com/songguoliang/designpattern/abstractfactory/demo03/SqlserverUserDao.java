package com.songguoliang.designpattern.abstractfactory.demo03;

public class SqlserverUserDao implements IUserDao{
	@Override
	public void insert(User user) {
		System.out.println("��sqlserver�и�user������һ����¼");
	}

	@Override
	public User getUser(int id) {
		System.out.println("��sqlserver�и���id�õ�Userһ����¼");
		return null;
	}
}

