package com.soft1841.oop.week1;

public class Car extends Vehicle {
    @Override
    public void getArea() {
        super.getArea();
        System.out.println("汽车在公路上行驶");
    }
}
