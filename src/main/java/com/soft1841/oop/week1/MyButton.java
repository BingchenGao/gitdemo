package com.soft1841.oop.week1;

import javafx.scene.control.Button;

public class MyButton extends Button {
    //自定义构造方法，实现一个指定宽和高和背景色的按钮
    public MyButton(){
        this.setPrefSize(100,30);
        //给当前按钮设置背景色
        this.setStyle("-fx-background-color: #FFFFFF;" +
                     "-fx-background-radius:100" );
    }
}

