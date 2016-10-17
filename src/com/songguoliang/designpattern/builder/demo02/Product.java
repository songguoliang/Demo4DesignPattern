package com.songguoliang.designpattern.builder.demo02;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private List<String>parts=new ArrayList<String>();
	
	public void add(String part){
		parts.add(part);
	}
	public void show(){
		System.out.println("产品创建");
		for(String part:parts){
			System.out.println(part);
		}
		
	}
}

