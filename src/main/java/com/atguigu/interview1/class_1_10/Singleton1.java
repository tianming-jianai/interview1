package com.atguigu.interview1.class_1_10;

/**
 * @BelongsProject: interview1
 * @BelongsPackage: com.atguigu.interview1.class_1_10
 * @Author: 张世罡
 * @CreateTime: 2022-03-15 15:26
 * @Description:
 * (1) 构造器私有化
 * (2) 自行创建，并且用静态变量保存
 * (3) 向外提供这个实例
 * (4) 强调这是一个单例，我们可以用final修饰
 */
public class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1();
    private Singleton1(){}

}

/*
- Singleton: 在java中即指单例模式，它是软件开发中最常见的设计模式之一
- 单：唯一
- 例：实例

- 单例设计模式，即某个类在整个系统中只能有一个实例对象可被获取和使用的代码模式。
- 例如：代表JVM运行环境的Runtime类

-----

要点：
- 一是某个类只能有一个实例：
    -  构造器私有化
- 二是它必须自行创建这个实例：
    - 含有一个该类的静态变量来保存这个唯一的实例
- 三是它必须自行向整个系统提供这个实例：
    - 对外提供获取该实例对象的方式
    - 1）直接暴露2）用今天太变量的get方法获取

-----

常见形式：
饿汉式：直接创建对象，不存在线程安全问题
    - 直接实例化饿汉（简洁直观）
    - 枚举式（最简洁）
    - 静态代码块饿汉式（适合复杂实例化）
懒汉式：延迟创建对象
    - 线程不安全（适用于单线程）
    - 线程安全（适用于多线程）
    - 静态累不累形式（适用于多线程）
 */