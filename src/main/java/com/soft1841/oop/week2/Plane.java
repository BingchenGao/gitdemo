package com.soft1841.oop.week2;

public class Plane extends FlyObject{


    public Plane(String name, double speed) {
        super(name, speed);
    }

    @Override
    public String fly() {
        return "飞机型号：" + this.name + ",飞行时速：" + "km/h";
    }
}
