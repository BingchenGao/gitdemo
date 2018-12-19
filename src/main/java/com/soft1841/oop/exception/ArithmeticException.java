package com.soft1841.oop.exception;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * 算数异常训练
 */

public class ArithmeticException {
    public static void main(String[] args) {
        int n = 3;
        try {
            System.out.println(n / 0);
        }catch (AbstractMethodError e) {
            //粗暴处理异常
            //e.printStackTrace();
            //友好处理异常
            System.err.println("除数不能为0！！");
        }


    }
}
