package com.soft1841.oop.week1;

public class Rectangle extends Shape  {
    @Override
    public void getArea() {
        super.getArea();
        int width = 10;
        int high = 5;
        System.out.println(width * high);
    }
}
