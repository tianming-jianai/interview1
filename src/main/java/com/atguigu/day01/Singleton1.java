package com.atguigu.day01;

/**
 * @BelongsProject: interview1
 * @BelongsPackage: com.atguigu.day01
 * @Author: 张世罡
 * @CreateTime: 2022/9/8 21:33
 * @Description:
 * 1) 构造器私有化
 * 2) 自行创建，并且用静态变量保存
 * 3) 向外提供这个实例
 * 4) 强调这是一个实例，我们可以用final修饰
 */
public class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {
    }
}
