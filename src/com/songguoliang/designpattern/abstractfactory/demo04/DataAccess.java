package com.songguoliang.designpattern.abstractfactory.demo04;

public class DataAccess {
	private static final String db="Access";
	
	public static IUserDao createUserDao(){
		if("Sqlserver".equals(db)){
			return new SqlserverUserDao();
		}else if("Access".equals(db)){
			return new AccessUserDao(); 
		}else{
			return null;
		}
	}
	
	public static IDepartmentDao createDepartmentDao(){
		if("Sqlserver".equals(db)){
			return new SqlserverDepartmentDao();
		}else if("Access".equals(db)){
			return new AccessDepartmentDao(); 
		}else{
			return null;
		}
	}
	
}

