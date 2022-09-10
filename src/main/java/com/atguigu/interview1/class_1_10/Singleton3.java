package com.atguigu.interview1.class_1_10;

import java.io.IOException;
import java.util.Properties;

/**
 * @BelongsProject: interview1
 * @BelongsPackage: com.atguigu.interview1.class_1_10
 * @Author: 张世罡
 * @CreateTime: 2022-03-15 16:24
 * @Description: 3)静态代码块
 */
public class Singleton3 {
    public static final Singleton3 INSTANCE;
    private String info;

    static{
        Properties p = new Properties();
        try {
            // 获取类路径下属性文件 classpath
            p.load(Singleton3.class.getClassLoader().getResourceAsStream("single.properties"));
            INSTANCE = new Singleton3(p.getProperty("info"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Singleton3(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Singleton3{" +
                "info='" + info + '\'' +
                '}';
    }
}
