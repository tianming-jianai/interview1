package com.atguigu.interview1.class_1_10;

/**
 * @BelongsProject: interview1
 * @BelongsPackage: com.atguigu.interview1.class_1_10
 * @Author: 张世罡
 * @CreateTime: 2022-03-15 17:50
 * @Description:
 *
 * 先初始化父类（5）（10）
 * 初始化子类（10）（6）
 *
 * 子类实例化方法
 * 1）super()（最前）    （9）（3）（2）
 * 2）i = test(); 子类非静态变量 （9）
 * 3）子类非静态代码块 （8）
 * 4）子类的无参构造（最后）（7）
 *
 * 因为创建了两个Son对象，因此实例化方法<init>执行两次
 * （9）（3）（2）（9）（8）（7）
 */
public class Son extends Father {
    private int i = test();
    private static int j = method();

    static {
        System.out.print("(6)");
    }

    Son() {
//        super(); // 写或不写都在，在之类构造器中一定会调用父类的构造器
        System.out.print("(7)");
    }

    {
        System.out.print("(8)");
    }

    @Override
    public int test() {
        System.out.print("(9)");
        return 1;
    }

    public static int method() {
        System.out.print("(10)");
        return 1;
    }

    public static void main(String[] args) {
        Son s1 = new Son();
        System.out.println();
        Son s2 = new Son();
    }
}

/*
考点：
 - 类初始化过程
 - 实例测试过程
 - 方法重写

 -----

类初始化过程
    - 1）一个类要创建实例需要先加载并初始化该类
        main方法所在类需要先加载和初始化
    - 2）一个子类要初始化需要先初始化父类
    - 3）一个类初始化就是执行<clinit>()方法
        <clinit>()方法由静态类变量显示赋值代码和静态代码块组成
        类变量显示赋值代码和静态代码从上到下顺序执行
        <clinit>()方法只执行一次

 -----

类初始化过程
    - 1）实例初始化就是执行<init>()方法
        <init>()方法可能重载有多个，有几个构造器就有几个<init>方法
        <init>()方法由非静态实例变量显式赋值代码和非静态代码块、对应构造器代码组成
        非静态实例变量显式赋值代码和非静态代码块代码块代码从上到下顺序执行，而对应构造器的代码最后执行
        每次创建实例对象，调用对应构造器，执行的就是对应的<init>方法
        <init>方法的首行是super()或super(实例参数)，即对应父类的<init>方法
    - 2）
    - 3）

 -----

 方法的重写Override
 1）哪些方法不可以被重写
    final方法
    静态方法
    private等子类中不可见方法
 2）对象的多态性
    子类如果重写了父类的方法，通过子类对象调用的一定是子类重写过的代码
    非静态方法默认的调用对象是this
    this对象在构造器或者说<init>方法中就是正在创建的对象

 */

/*
进阶要求：
Override和Overload的区别？
Override重写的要求？
    - 方法名
    - 形参列表
    - 返回值类型
    - 抛出的异常列表
    - 修饰符
了解《JVM虚拟机规范》中关于<clinit>和<init>方法的说明、invokespecial指令
 */