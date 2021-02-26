package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author caoyx
 * @date
 */
public class TemplateTest {
    private static final Customer cust=new Customer();


    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplateTest.main");
        System.out.println("args = " + args);
        int num = 10;
        System.out.println("num = " + num);
        System.out.println(num);
        String[] arr = new String[]{"a", "b"};
        for (int i = 0; i < arr.length; i++) {

        }
        for (String s : arr) {

        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }
        ArrayList arrlist = new ArrayList();
        arrlist.add(123);
        if (arrlist == null) {

        }
        if (arrlist == null) {

        }
        if (arrlist != null) {

        }
        if (arrlist != null) {

        }
        if (arrlist == null) {

        }
    }
}
