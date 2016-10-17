package com.songguoliang.designpattern.abstractfactory.demo03;

public class OracleUserDao implements IUserDao{
	@Override
	public void insert(User user) {
		System.out.println("在Oracle中给user表增加一条记录");
	}

	@Override
	public User getUser(int id) {
		System.out.println("在Oracle中根据id得到User一条记录");
		return null;
	}
}

