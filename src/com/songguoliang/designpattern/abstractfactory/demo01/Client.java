package com.songguoliang.designpattern.abstractfactory.demo01;

public class Client {
	public static void main(String[] args) {
		User user=new User();
		SqlserverUserDao su=new SqlserverUserDao();
		su.insert(user);
		su.getUser(1);
		
	}
}

