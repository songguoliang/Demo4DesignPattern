package com.songguoliang.designpattern.proxy.demo04;

public class Proxy implements Subject{
	private RealSubject realSubject;
	
	@Override
	public void request() {
		if(realSubject==null){
			realSubject=new RealSubject();
		}
		realSubject.request();
	}

}

