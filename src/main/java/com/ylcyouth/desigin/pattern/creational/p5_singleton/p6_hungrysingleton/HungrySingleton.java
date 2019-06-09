package com.ylcyouth.desigin.pattern.creational.p5_singleton.p6_hungrysingleton;

/**
 * @author ylcyouth
 * @create 2019/6/9 10:50
 */
public class HungrySingleton {

    //使用static代码块，或者直接 private static final HungrySingleton INSTANCE = new HungrySingleton()
    private static final HungrySingleton INSTANCE;

    static {
        INSTANCE = new HungrySingleton();
    }

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
