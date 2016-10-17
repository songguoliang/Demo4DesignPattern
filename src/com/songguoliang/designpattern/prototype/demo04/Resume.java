package com.songguoliang.designpattern.prototype.demo04;

public class Resume implements Cloneable{
	private String name;
	private String sex;
	private String age;
	private WorkExperience we;
	
	public Resume(String name) {
		this.name = name;
		we=new WorkExperience();
	}
	public void setPersonalInfo(String sex,String age){
		this.sex=sex;
		this.age=age;
	}
	public void setWorkExperience(String timeArea,String company){
		we.setTimeArea(timeArea);
		we.setCompany(company);
	}
	public void display(){
		System.out.println(name+" "+sex+" "+age);
		System.out.println("工作经历："+we.getTimeArea()+" "+we.getCompany());
	}
	@Override
	public Resume clone(){
		try {
			return (Resume)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}

