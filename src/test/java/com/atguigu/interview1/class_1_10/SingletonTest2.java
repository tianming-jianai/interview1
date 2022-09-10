package com.atguigu.interview1.class_1_10;

import com.atguigu.day01.Singleton2;
import com.atguigu.day01.Singleton3;
import com.atguigu.day01.Singleton4;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @BelongsProject: interview1
 * @BelongsPackage: com.atguigu.interview1.class_1_10
 * @Author: 张世罡
 * @CreateTime: 2022/9/8 21:37
 * @Description:
 */
public class SingletonTest2 {
    /**
     * 获取单例对象
     */
    @Test
    public void test1() {
        // 静态属性
        Singleton1 singleton1 = Singleton1.INSTANCE;
        System.out.println(singleton1);
        // 枚举类型
        Singleton2 singleton2 = Singleton2.INSTANCE;
        System.out.println(singleton2);

    }

    /**
     * 静态代码块加载配置信息
     */
    @Test
    public void test2() {
        Singleton3 singleton3 = Singleton3.INSTANCE;
        String info = singleton3.getInfo();
        System.out.println(info);
    }

    /**
     * 单线程懒汉式
     */
    @Test
    public void test3(){
        Singleton4 instance1 = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        System.out.println(instance1 == instance2);
    }

    /**
     * 多线程懒汉式
     */
    @Test
    public void test4() throws ExecutionException, InterruptedException {
        Callable<Singleton4> callable = new Callable<>() {
            @Override
            public Singleton4 call() throws Exception {
                return Singleton4.getInstance();
            }
        };
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Future<Singleton4> future1 = pool.submit(callable);
        Future<Singleton4> future2 = pool.submit(callable);
        Singleton4 s1 = future1.get();
        Singleton4 s2 = future2.get();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        pool.shutdown();
    }
}
