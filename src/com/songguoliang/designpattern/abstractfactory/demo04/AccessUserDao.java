package com.songguoliang.designpattern.abstractfactory.demo04;

public class AccessUserDao implements IUserDao{
	@Override
	public void insert(User user) {
		System.out.println("在Access中给user表增加一条记录");
	}

	@Override
	public User getUser(int id) {
		System.out.println("在Access中根据id得到User一条记录");
		return null;
	}
}

