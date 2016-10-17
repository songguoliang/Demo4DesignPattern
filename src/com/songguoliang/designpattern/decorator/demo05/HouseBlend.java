package com.songguoliang.designpattern.decorator.demo05;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "HouseBlend";
    }
    
    @Override
    public double cost() {
        return 0.89;
    }

}
