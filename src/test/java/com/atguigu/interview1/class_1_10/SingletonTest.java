package com.atguigu.interview1.class_1_10;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ExceptionUtils;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @BelongsProject: interview1
 * @BelongsPackage: com.atguigu.interview1.class_1_10
 * @Author: 张世罡
 * @CreateTime: 2022-03-15 15:34
 * @Description:
 */
public class SingletonTest {

    @Test
    public void test(){
        Singleton1 instance = Singleton1.INSTANCE;
        System.out.println(instance);

        Singleton2 instance2 = Singleton2.INSTANCE;
        System.out.println(instance2);

        Singleton3 instance3 = Singleton3.INSTANCE;
        System.out.println(instance3);
        System.out.println(instance3.getInfo());
    }

    @Test
    public void test2() throws ExecutionException, InterruptedException {
//        单线程没问题
//        Singleton4 instance4 = Singleton4.getInstance();
//        Singleton4 instance4_2 = Singleton4.getInstance();
//        System.out.println(instance4);
//        System.out.println(instance4_2);
//        System.out.println(instance4 == instance4_2);

//        多线程
        Callable<Singleton4> c = new Callable<Singleton4>() {
            @Override
            public Singleton4 call() throws Exception {
                return Singleton4.getInstance();
            }
        };
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton4> f1 = es.submit(c);
        Future<Singleton4> f2 = es.submit(c);
        Singleton4 s1 = f1.get();
        Singleton4 s2 = f2.get();

        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
    }

    @Test
    public void test3(){
        Singleton6 instance = Singleton6.getInstance();
        Singleton6 instance2 = Singleton6.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance);
        System.out.println(instance2);
    }
}
