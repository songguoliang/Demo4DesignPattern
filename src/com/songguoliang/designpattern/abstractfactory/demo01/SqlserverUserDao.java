package com.songguoliang.designpattern.abstractfactory.demo01;

public class SqlserverUserDao {
	public void insert(User user){
		System.out.println("在sqlserver中给user表增加一条记录");
	}
	
	public User getUser(int id){
		System.out.println("在sqlserver中根据id得到User一条记录");
		return null;
	}
}

