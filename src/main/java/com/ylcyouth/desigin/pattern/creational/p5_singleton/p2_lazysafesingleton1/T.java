package com.ylcyouth.desigin.pattern.creational.p5_singleton.p2_lazysafesingleton1;

import sun.awt.image.PixelConverter;

/**
 * @author ylcyouth
 * @create 2019/6/8 19:12
 */
public class T implements Runnable{

    @Override
    public void run() {

        LazySafeSingleton1 instance = LazySafeSingleton1.getInstance();

        System.out.println(Thread.currentThread().getName() + ": " + PixelConverter.Argb.instance);
    }
}
