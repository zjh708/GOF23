package com.zjh.设计模式.创建型.单例模式.注册试单例.容器式;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 锦zero
 * @date 2020-12-22 15:22
 * @description: 容器式单例模式适用于需要大量创建单例对象的场景,便于管理。但它是非线程安全的。
 *
 */
public class ContainerSingleton {
    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    private ContainerSingleton() {
    }

    public Object getBean(String className) throws Exception {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object o = Class.forName(className).newInstance();
                ioc.put(className, o);
                return o;
            }
            return ioc.get(className);
        }

    }
}
