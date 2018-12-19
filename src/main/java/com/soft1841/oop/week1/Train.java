package com.soft1841.oop.week1;

public class Train extends Vehicle{
    @Override
    public void getArea() {
        super.getArea();
        System.out.println("火可以在铁轨上移动");
    }
}
