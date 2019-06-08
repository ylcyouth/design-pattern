package com.ylcyouth.desigin.pattern.creational.p5_singleton.p3_lazysafesingleton2;

import com.ylcyouth.desigin.pattern.creational.p5_singleton.p2_lazysafesingleton1.LazySafeSingleton1;
import sun.awt.image.PixelConverter;

/**
 * @author ylcyouth
 * @create 2019/6/8 19:12
 */
public class T implements Runnable{

    @Override
    public void run() {

        LazySafeSingleton2 instance = LazySafeSingleton2.getInstance();

        System.out.println(Thread.currentThread().getName() + ": " + PixelConverter.Argb.instance);
    }
}
