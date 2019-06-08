package com.ylcyouth.desigin.pattern.creational.p5_singleton.p2_lazysafesingleton1;

/**
 * @author ylcyouth
 * @create 2019/6/8 19:50
 */
public class LazySafeSingleton1 {
    private static LazySafeSingleton1 instance = null;

    private LazySafeSingleton1() {}

    public synchronized static  LazySafeSingleton1 getInstance() {
        if (instance == null) {
            instance = new LazySafeSingleton1();
        }
        return instance;
    }
}
