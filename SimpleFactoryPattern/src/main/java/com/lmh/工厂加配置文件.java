package com.lmh;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: DesignPatterns
 * @className: com.lmh.工厂加配置文件
 * @createDate: 2023/9/24 18:55
 */
public class 工厂加配置文件 {
    // 加载配置文件,获取配置文件中配置的全类名，并创建该类的对象进行存储
    // 1、定义容器对象存储咖啡对象
    private static HashMap<String,Coffee> map = new HashMap<>();
    // 2、加载配置文件，只需要加载一次
    static {
        // 2.1 创建Properties对象
        Properties properties = new Properties();
        // 2.2 调用p对象中的load方法进行配置文件的加载
        try {
            properties.load(工厂加配置文件.class.getClassLoader().getResourceAsStream("bean.properties"));
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                String className = properties.getProperty((String) key);

                // 通过反射创建对象
                Class<?> aClass = Class.forName(className);
                Coffee coffee = (Coffee) aClass.newInstance();

                // 将名称和对象存储到容器中
                map.put((String) key,coffee);
            }
        } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
    public static Coffee createCoffee(String name) {
        return map.get(name);
    }
}
