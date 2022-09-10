package com.atguigu.interview1.class_1_10;

/**
 * @BelongsProject: interview1
 * @BelongsPackage: com.atguigu.interview1.class_1_10
 * @Author: 张世罡
 * @CreateTime: 2022-03-16 16:41
 * @Description:
 */
public class SprintBeanScope {

}
/*
SpringBean的作用域之间有什么区别？
    bean的作用域，可以通过scope属性来指定bean的作用域
        - singleton：默认值，当IOC容器一创建就会创建bean的实例，而且是单例的，每次得到的都是同一个
        - prototype：原型的。当IOC容器一创建不再实例化该bean，每次调用getBean方法时再实例化该bean，而且每调用一次就创建一个实例
        - request：每次请求实例化一个bean
        - session：在一次会话中共享一个bean
 */