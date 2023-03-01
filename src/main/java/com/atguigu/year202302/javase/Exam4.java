package com.atguigu.year202302.javase;

/**
 * @BelongsProject: interview1
 * @BelongsPackage: com.atguigu.year202302.javase
 * @Author: 张世罡
 * @CreateTime: 2023/3/1 20:58
 * @Description:
 * ① 形参是基本数据类型
 *  传递数据值
 * ② 实参是引用数据类型
 *  传递地址值
 *  特殊的类型：String、包装类等对象不可变性
 */
public class Exam4 {
    public static void main(String[] args) {
        int i = 1;
        String s = "hello";
        Integer num = 200;
        int[] arr = {1, 2, 3, 4, 5};
        MyData my = new MyData();

        change(i, s, num, arr, my);

        System.out.println(i);
        System.out.println(s);
        System.out.println(num);
        System.out.println(arr[0]);
        System.out.println(my.a);
    }

    private static void change(int i, String s, Integer num, int[] arr, MyData my) {
        i += 1;
        s += "world";
        num += 1;
        arr[0] += 1;
        my.a += 1;
    }
}

class MyData {
    int a = 10;

}