package com.atguigu.interview1.class_1_10;

/**
 * @BelongsProject: interview1
 * @BelongsPackage: com.atguigu.interview1.class_1_10
 * @Author: 张世罡
 * @CreateTime: 2022-03-15 22:41
 * @Description:
 */
public class Exam6 {
    static int s;
    int i, j;

    {
        int i = 1;
        i++;
        j++;
        s++;
    }

    public void test(int j) {
        j++;
        i++;
        s++;
    }

    public static void main(String[] args) {
        Exam6 obj1 = new Exam6();
        Exam6 obj2 = new Exam6();
        obj1.test(10);
        obj1.test(20);
        obj2.test(30);
        System.out.println(obj1.i + "," + obj1.j + "," + Exam6.s);
        System.out.println(obj2.i + "," + obj2.j + "," + Exam6.s);

    }
}

/*
考点：
- 就近原则
- 变量的分类
    - 成员变量：类变量、实例变量
    - 局部变量
- 非静态代码块的执行：每次创建实例对象都会执行
- 方法的调用构造：调用一次执行一次

-----

局部变量与成员变量的区别：
    1）声明的位置
        - 局部变量：方法体{}中，形参，代码块{}中
        - 成员变量：类中方法外
            - 类变量：有static修饰
            - 实例变量：没有static修饰
    2）修饰符
        - 局部变量：final
        - 成员变量：public、protected、private、final、static、volatile、transient
    3）值存储的位置
        - 局部变量：栈
        - 实例变量：堆
        - 类变量：方法区
    4）作用域
        - 局部变量：从声明处开始，到所属的}结束
        - 实例变量：在当前类中"this."（有时this.可以省略），在其他类中"对象名."访问
        - 类变量：在当前类中"类名."（有时类名.可以省略）,在其他类中"类名."或"对象名."访问
    5）生命周期
        - 局部变量：每一个线程，每一次调用都是新的生命周期
        - 实例变量：随着对象的创建而初始化，随着对象的被回收而消亡，每一个对象的实例变量是独立的
        - 类变量：随着类的初始化而初始化，随着类的卸载而消亡，该类的所有对象的类变量是共享的
-----

当局部变量与xx变量重名时，如何区分
    1）局部变量与实例变量重名
        - 在实例变量前面加 this.
    2）局部变量与类变量重名
        - 在类变量前加 类名.
 */

/*
堆（heap）
    此内存区域的唯一目的是存放对象实例，几乎所有的对象实例都在这里分配内存。
    这一点在Java虚拟机规范中的描述是：所有的对象实例以及数组都要在堆上分配。
栈（stack）
    是指虚拟机栈。虚拟机栈用于存储局部变量表等。局部变量表存放了编译期可知长度的各种基本数据类型
    （boolean、byte、char、short、int、float、long、double）、对象引用（reference类型，它不等同于对象本身，
    是对象在堆内存的首地址）。方法执行完成，自动释放。
方法区（Method Area）
    用于存储已被虚拟机加载的类信息、常量、静态变量、即时编译器编译后的代码等数据。

 */