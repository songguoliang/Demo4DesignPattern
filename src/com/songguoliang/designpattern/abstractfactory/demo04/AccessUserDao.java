package com.songguoliang.designpattern.abstractfactory.demo04;

public class AccessUserDao implements IUserDao{
	@Override
	public void insert(User user) {
		System.out.println("��Access�и�user������һ����¼");
	}

	@Override
	public User getUser(int id) {
		System.out.println("��Access�и���id�õ�Userһ����¼");
		return null;
	}
}

