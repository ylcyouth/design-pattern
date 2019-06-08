package com.ylcyouth.desigin.pattern.creational.p5_singleton.p3_lazysafesingleton2;

/**
 * @author ylcyouth
 * @create 2019/6/8 20:13
 */
public class LazySafeSingleton2 {
    private static LazySafeSingleton2 instance = new LazySafeSingleton2();

    private LazySafeSingleton2() {}

    public static LazySafeSingleton2 getInstance() {
        synchronized(LazySafeSingleton2.class) {
            if (instance == null) {
                instance = new LazySafeSingleton2();
            }
        }
        return instance;
    }
}
