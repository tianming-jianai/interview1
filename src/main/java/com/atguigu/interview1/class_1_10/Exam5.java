package com.atguigu.interview1.class_1_10;

/**
 * @BelongsProject: interview1
 * @BelongsPackage: com.atguigu.interview1.class_1_10
 * @Author: 张世罡
 * @CreateTime: 2022-03-15 22:09
 * @Description: 编程题：有n个台阶，一次只能上1步或2步，共有多少种走法？
 * 1. 递归
 * 2. 循环迭代
 */
public class Exam5 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        System.out.println(f(45));
        System.out.println(loop(4));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static int f(int n) {
        if (n < 1) {
            throw new IllegalArgumentException(n + "不能小于1");
        }
        if (n == 1 || n == 2) {
            return n;
        }
        return f(n - 2) + f(n - 1);
    }

    public static int loop(int n) {
        if (n < 1) {
            throw new IllegalArgumentException(n + "不能小于1");
        }
        if (n == 1 || n == 2) {
            return n;
        }
        int one = 2, two = 1, sum = 0;
        // 最后跨2步，最后跨1步的走法
        for (int i = 3; i <= n; i++) {
            sum = one + two;
            two = one;
            one = sum;
        }
        return sum;

    }
}
