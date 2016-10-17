package com.songguoliang.designpattern.abstractfactory.demo02;

public class Client {
	public static void main(String[] args) {
		IFactory iFactory=new AccessFactory();
		IUserDao iUser=iFactory.createUserDao();
		User user=new User();
		iUser.insert(user);
		iUser.getUser(1);
		
	}
}

