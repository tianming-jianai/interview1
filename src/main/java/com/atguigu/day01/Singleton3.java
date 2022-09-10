package com.atguigu.day01;

import java.io.IOException;
import java.util.Properties;

/**
 * @BelongsProject: interview1
 * @BelongsPackage: com.atguigu.day01
 * @Author: 张世罡
 * @CreateTime: 2022/9/8 21:41
 * @Description:
 * 静态代码块单例
 */
public class Singleton3 {
    public static final Singleton3 INSTANCE;
    private String info;

    static {
        // 加载配置文件
        Properties properties = new Properties();
        try {
            properties.load(Singleton3.class.getClassLoader().getResourceAsStream("single.properties"));

            INSTANCE = new Singleton3(properties.getProperty("info"));
        } catch (IOException e) {
            throw new RuntimeException("加载配置文件出错");
        }
    }

    public Singleton3(String info) {
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
