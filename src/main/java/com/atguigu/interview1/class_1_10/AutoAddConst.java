package com.atguigu.interview1.class_1_10;

/**
 * @BelongsProject: interview1
 * @BelongsPackage: com.atguigu.interview1.class_1_10
 * @Author: 张世罡
 * @CreateTime: 2022-03-15 15:06
 * @Description:  局部变量表 操作数栈
 */
public class AutoAddConst {
    public static void main(String[] args) {
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println(String.format("i = %d, j = %d, k = %d", i, j, k));
    }
}

/*
小结：
- 赋值=，最后运算
- =右边的从左到右架子啊值依次压如操作数栈
- 实际先算哪个，看运输符优先级
- 自增、自减操作都是直接修改变量的值，不经过操作数栈
- 最后的赋值之前，临时结果也是存储在操作数栈中

- 建议：《JVM虚拟机规范》关于指令的部分
 */
