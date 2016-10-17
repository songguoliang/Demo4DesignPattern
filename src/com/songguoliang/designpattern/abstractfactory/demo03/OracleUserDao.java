package com.songguoliang.designpattern.abstractfactory.demo03;

public class OracleUserDao implements IUserDao{
	@Override
	public void insert(User user) {
		System.out.println("��Oracle�и�user������һ����¼");
	}

	@Override
	public User getUser(int id) {
		System.out.println("��Oracle�и���id�õ�Userһ����¼");
		return null;
	}
}

