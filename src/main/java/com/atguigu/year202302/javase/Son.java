package com.atguigu.year202302.javase;

/**
 * @BelongsProject: interview1
 * @BelongsPackage: com.atguigu.year202302.javase
 * @Author: 张世罡
 * @CreateTime: 2023/2/23 21:32
 * @Description:
 */
public class Son extends Father{

    private int i = test();

    private static int j = method();

    static {
        System.out.print("(6)");
    }

    public Son() {
        System.out.print("(7)");
    }

    {
        System.out.print("(8)");
    }
    public int test(){
        System.out.print("(9)");
        return 1;
    }

    public static int method(){
        System.out.print("(10)");
        return 1;
    }

    public static void main(String[] args) {
        Son s1 = new Son();
        System.out.println();
        Son s2 = new Son();
    }
}
