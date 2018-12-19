package com.soft1841.oop.week2;

public  class Bird  extends FlyObject{


    public Bird(String name, double speed) {
        super(name, speed);
    }

    @Override
    public String fly(){
        return "飞禽名称：" + this.name + ",飞行时速：" + this.speed + "km/h";
    }
}
