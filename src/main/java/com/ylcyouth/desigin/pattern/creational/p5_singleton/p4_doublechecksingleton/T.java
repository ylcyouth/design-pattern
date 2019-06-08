package com.ylcyouth.desigin.pattern.creational.p5_singleton.p4_doublechecksingleton;

import com.ylcyouth.desigin.pattern.creational.p5_singleton.p3_lazysafesingleton2.LazySafeSingleton2;
import sun.awt.image.PixelConverter;

/**
 * @author ylcyouth
 * @create 2019/6/8 19:12
 */
public class T implements Runnable{

    @Override
    public void run() {

        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + ": " + PixelConverter.Argb.instance);
    }
}
