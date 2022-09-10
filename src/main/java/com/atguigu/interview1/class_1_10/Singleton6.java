package com.atguigu.interview1.class_1_10;

/**
 * @BelongsProject: interview1
 * @BelongsPackage: com.atguigu.interview1.class_1_10
 * @Author: 张世罡
 * @CreateTime: 2022-03-15 17:18
 * @Description:
 * 在内部类被加载和初始化时，才创建INSTANCE实例对象
 * 静态内部类不会自动随着外部类的加载和测试而初始化，它是要单独去加载和初始化的。
 * 因为是在内部类加载和初始化时创建的，所以是线程安全的
 */
public class Singleton6 {
    private Singleton6(){}

    private static class Inner{
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public static Singleton6 getInstance(){
        return Inner.INSTANCE;
    }
}
