package com.songguoliang.designpattern.prototype.demo01;

public class Client {
	public static void main(String[] args) {
		Resume a=new Resume("����");
		a.setPersonalInfo("��","29");
		a.setWorkExperience("1998-2000","xx��˾");
		
		Resume b=new Resume("����");
		b.setPersonalInfo("��","29");
		b.setWorkExperience("1998-2000","xx��˾");
		
		Resume c=new Resume("����");
		c.setPersonalInfo("��","29");
		c.setWorkExperience("1998-2000","xx��˾");
		
		a.display();
		b.display();
		c.display();
		
		
	}
}

