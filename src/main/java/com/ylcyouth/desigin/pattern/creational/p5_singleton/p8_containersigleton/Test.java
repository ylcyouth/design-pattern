package com.ylcyouth.desigin.pattern.creational.p5_singleton.p8_containersigleton;

/**
 * @author ylcyouth
 * @create 2019/6/9 11:46
 */
public class Test {

    public static void main(String[] args) {

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());

        t1.start();
        t2.start();

        System.out.println("program end...");
    }
}
