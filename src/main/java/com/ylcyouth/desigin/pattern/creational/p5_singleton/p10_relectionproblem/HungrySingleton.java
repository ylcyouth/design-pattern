package com.ylcyouth.desigin.pattern.creational.p5_singleton.p10_relectionproblem;

import java.io.Serializable;

/**
 * @author ylcyouth
 * @create 2019/6/9 11:51
 */
public class HungrySingleton implements Serializable {

    private static final HungrySingleton INSTANCE;

    static {
        INSTANCE = new HungrySingleton();
    }

    private HungrySingleton() {
        //解决反射破坏单例的问题
        if (INSTANCE != null) {
            throw new RuntimeException("单例构造器禁止反射调用...");
        }
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }

    /**
     * 解决序列化和反序列破坏单例的问题
     */
    public Object readResolve() {
        return INSTANCE;
    }
}
