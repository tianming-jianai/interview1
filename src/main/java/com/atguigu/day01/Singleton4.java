package com.atguigu.day01;

/**
 * @BelongsProject: interview1
 * @BelongsPackage: com.atguigu.day01
 * @Author: 张世罡
 * @CreateTime: 2022/9/8 21:55
 * @Description:
 * 懒汉式：
 *
 * 1) 构造器私有化
 * 2) 用一个静态变量保存这个唯一的实例
 * 3) 提供一个静态方法，获取这个实例
 */
public class Singleton4 {
    private static Singleton4 instance;
    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if(instance == null){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            instance = new Singleton4();
        }
        return instance;
    }
}
