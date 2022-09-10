package com.atguigu.interview1.class_1_10;

import java.util.Arrays;

/**
 * @BelongsProject: interview1
 * @BelongsPackage: com.atguigu.interview1.class_1_10
 * @Author: 张世罡
 * @CreateTime: 2022-03-15 21:26
 * @Description:
 * 考点？
 * 方法的传参机制
 * String、包装类等对象的不可变性
 *
 * 方法的传参机制
 *  1）形参是基本数据类型
 *      传递数据值
 *  2）实参是引用数据类型
 *      传递地址值
 *      特殊类型：String、包装类型等对象不可变性
 */
public class Exam4 {
    public static void main(String[] args) {
        int i = 1;
        String str = "hello";
        Integer num = 2;
        int[] arr = {1, 2, 3, 4, 5};
        MyData my = new MyData();

        change(i, str, num, arr, my);

        System.out.println("i = " + i);
        System.out.println("str = " + str);
        System.out.println("num = " + num);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("my.a = " + my.a);
    }

    public static void change(int j, String s, Integer n, int[] a, MyData my) {
        j += 1;
        s += "world";
        n += 1;
        a[0] += 1;
        my.a += 1;
    }
}

class MyData {
    int a = 10;
}
