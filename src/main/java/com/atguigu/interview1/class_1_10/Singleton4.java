package com.atguigu.interview1.class_1_10;

/**
 * @BelongsProject: interview1
 * @BelongsPackage: com.atguigu.interview1.class_1_10
 * @Author: 张世罡
 * @CreateTime: 2022-03-15 16:46
 * @Description: 懒汉式：
 * 延迟创建这个实例对象
 * (1) 构造器私有化
 * (2) 用一个静态变量保存这个唯一的实例
 * (3) 提供一个静态方法，获取这个实例对象
 *
 * DCL 双检锁
 */
public class Singleton4 {
    private volatile static Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
