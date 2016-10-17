package com.songguoliang.designpattern.decorator.demo05;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "DarkRoast";
    }
    @Override
    public double cost() {
        return 1.05;
    }

}