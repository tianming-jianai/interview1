package com.atguigu.day03;

import java.util.Arrays;

/**
 * @BelongsProject: interview1
 * @BelongsPackage: com.atguigu.day03
 * @Author: 张世罡
 * @CreateTime: 2022/9/10 13:34
 * @Description:
 */
public class Exam4 {

    public static void main(String[] args) {
        int i = 1;
        String str = "hello ";
        Integer num = 200;
        int[] arr = {1, 2, 3, 4, 5};
        MyData data = new MyData();

        change(i, str, num, arr, data);

        System.out.println("i = " + i);
        System.out.println("str = " + str);
        System.out.println("num = " + num);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("data.a = " + data.a);
    }

    public static void change(int j, String s, Integer n, int[] a, MyData m) {
        j += 1;
        s += "world";
        Integer n1 = n;
        n += 1;
        System.out.println("----------------");
        System.out.println(n1 == n);
        a[0] += 1;
        m.a += 1;
    }
}

class MyData {
    int a = 10;
}