package com.soft1841.oop.exception;

/**
 * 数组下标越界的异常训练
 */

public class BoundsExceptionDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try {
            for (int i = 0;i < arr.length + 1; i++) {
                System.out.print(arr[i] + "  ");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            //友好处理
            System.out.println("下标越界了！");
        }

    }
}
