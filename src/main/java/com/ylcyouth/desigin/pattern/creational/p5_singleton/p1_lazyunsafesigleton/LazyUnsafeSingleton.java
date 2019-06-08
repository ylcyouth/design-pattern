package com.ylcyouth.desigin.pattern.creational.p5_singleton.p1_lazyunsafesigleton;

/**
 * @author ylcyouth
 * @create 2019/6/8 19:01
 */
public class LazyUnsafeSingleton {

    private static LazyUnsafeSingleton instance = null;

    private LazyUnsafeSingleton(){}

    public static LazyUnsafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazyUnsafeSingleton();
        }
        return instance;
    }
}
