package com.ylcyouth.desigin.pattern.creational.p5_singleton.p3_lazysafesingleton2;

/**
 * @author ylcyouth
 * @create 2019/6/8 19:15
 */
public class TestMultiThread {

    public static void main(String[] args) {

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());

        t1.start();
        t2.start();

        System.out.println("program end...");


    }
}
