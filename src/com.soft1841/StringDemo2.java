package com.soft1841;

public class StringDemo2 {

    public static void main(String[] args) {

        String str = "I Love Java";

        System.out.println(str.length());

        //分割字符串，得到字符串数组

        String[] letters = str.split(" ");

        for (String letter:letters

        ) {

            System.out.println(letter);

        }

    }

}


