package com.soft1841.oop.week2;

public class ShapeTest {
    public static void main(String[] args) {
        //通过上转型对象创建一个三角形的对象
        Shape shape = new Triangle(4.0,3.0);
        System.out.println( "三角形面积是：" + shape.getArea());
        //通过上转型对象创建一个矩形的对象
        Shape shape1 = new Rectangle(4.0,3.0);
        System.out.println("矩形面积是：" + shape1.getArea());
        //通过最终类创建一个立方体对象
        Cube cube = new Cube(4.0,3.0,2.0);
        System.out.println("立方体的面积是：" + cube.getVolumn());
    }
}
