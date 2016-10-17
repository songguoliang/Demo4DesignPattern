package com.songguoliang.designpattern.abstractfactory.demo04;

public interface IUserDao {
	void insert(User user);
	
	User getUser(int id);
}

