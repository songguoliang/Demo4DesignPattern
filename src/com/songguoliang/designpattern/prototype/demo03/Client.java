package com.songguoliang.designpattern.prototype.demo03;

public class Client {
	public static void main(String[] args) {
		Resume a=new Resume("´óÄñ");
		a.setPersonalInfo("ÄÐ","29");
		a.setWorkExperience("1998-2000","xx¹«Ë¾");
		
		Resume b=a.clone();
		Resume c=b.clone();
		a.display();
		b.display();
		c.display();
	}
}

