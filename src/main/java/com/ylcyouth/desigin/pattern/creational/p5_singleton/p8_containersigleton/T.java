package com.ylcyouth.desigin.pattern.creational.p5_singleton.p8_containersigleton;

/**
 * @author ylcyouth
 * @create 2019/6/9 11:56
 */
public class T implements Runnable {
    @Override
    public void run() {
        ContainerSingleton.putInstance("a", new Object());
        Object instance = ContainerSingleton.getInstance("a");

        System.out.println(Thread.currentThread().getName() + ": " + instance);
    }
}
