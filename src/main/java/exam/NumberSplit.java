package exam;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.util.Scanner;

public class NumberSplit {
    public static void main(String[] args) {
        System.out.println("请输入一个数字串");
        Scanner scanner = new Scanner(System.in);
        String nums = scanner.nextLine();
        //
        StringBuffer str = new StringBuffer(nums);
        System.out.println("处理前的字符串");
        System.out.println(str);
        //进行逗号的处理
        for(int i = nums.length();i > 0;i=i-3) {
            if(i>3) {
                str.insert(i - 3,',');
            }
        }
        System.out.println(str);
    }
}
