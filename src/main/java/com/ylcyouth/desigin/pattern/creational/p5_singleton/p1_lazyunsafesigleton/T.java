package com.ylcyouth.desigin.pattern.creational.p5_singleton.p1_lazyunsafesigleton;

/**
 * @author ylcyouth
 * @create 2019/6/8 19:12
 */
public class T implements Runnable{

    @Override
    public void run() {

        LazyUnsafeSingleton instance = LazyUnsafeSingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + ": " + instance);
    }
}
