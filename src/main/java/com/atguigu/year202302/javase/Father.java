package com.atguigu.year202302.javase;

/**
 * @BelongsProject: interview1
 * @BelongsPackage: com.atguigu.year202302.javase
 * @Author: 张世罡
 * @CreateTime: 2023/2/23 21:32
 * @Description:
 */
public class Father {

    private int i = test();

    private static int j = method();

    static {
        System.out.print("(1)");
    }

    public Father() {
        System.out.print("(2)");
    }

    {
        System.out.print("(3)");
    }

    public int test(){
        System.out.print("(4)");
        return 1;
    }

    private static int method() {
        System.out.print("(5)");
        return 1;
    }
}
