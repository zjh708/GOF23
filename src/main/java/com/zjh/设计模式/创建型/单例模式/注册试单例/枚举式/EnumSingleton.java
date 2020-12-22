package com.zjh.设计模式.创建型.单例模式.注册试单例.枚举式;

/**
 * @author 锦zero
 * @date 2020-12-22 10:17
 * @description: 枚举式单例
 */
public enum EnumSingleton {
    INSTANCE;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private Object data;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

}
