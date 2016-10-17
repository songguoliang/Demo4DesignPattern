package com.songguoliang.designpattern.abstractfactory2.demo01;

public class Customer {
	public static void main(String[] args){    
        //��������320ϵ�����
		AbstractFactory factoryBMW320 = new FactoryBMW320();    
        factoryBMW320.createEngine();  
        factoryBMW320.createAircondition();  
            
        //��������523ϵ�����
        AbstractFactory factoryBMW523 = new FactoryBMW523();    
        factoryBMW523.createEngine();  
        factoryBMW523.createAircondition();  
        
        //��������600ϵ�����
        AbstractFactory factoryBMW600 = new FactoryBMW600();    
        factoryBMW600.createEngine();  
        factoryBMW600.createAircondition();  
    }    
}

