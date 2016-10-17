package com.songguoliang.designpattern.abstractfactory.demo03;

public interface IUserDao {
	void insert(User user);
	
	User getUser(int id);
}

