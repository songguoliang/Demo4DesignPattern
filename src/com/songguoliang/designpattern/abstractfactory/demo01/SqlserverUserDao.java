package com.songguoliang.designpattern.abstractfactory.demo01;

public class SqlserverUserDao {
	public void insert(User user){
		System.out.println("��sqlserver�и�user������һ����¼");
	}
	
	public User getUser(int id){
		System.out.println("��sqlserver�и���id�õ�Userһ����¼");
		return null;
	}
}

