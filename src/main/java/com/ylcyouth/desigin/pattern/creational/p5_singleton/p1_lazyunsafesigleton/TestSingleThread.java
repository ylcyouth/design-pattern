package com.ylcyouth.desigin.pattern.creational.p5_singleton.p1_lazyunsafesigleton;

/**
 * @author ylcyouth
 * @create 2019/6/8 19:18
 */
public class TestSingleThread {

    public static void main(String[] args) {
        LazyUnsafeSingleton instance = LazyUnsafeSingleton.getInstance();
        System.out.println(instance);
    }
}
