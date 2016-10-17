package com.songguoliang.designpattern.abstractfactory.demo02;

public interface IUserDao {
	void insert(User user);
	
	User getUser(int id);
}

