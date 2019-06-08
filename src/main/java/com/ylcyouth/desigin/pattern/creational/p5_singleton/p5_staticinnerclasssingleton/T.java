package com.ylcyouth.desigin.pattern.creational.p5_singleton.p5_staticinnerclasssingleton;

import com.ylcyouth.desigin.pattern.creational.p5_singleton.p4_doublechecksingleton.LazyDoubleCheckSingleton;
import sun.awt.image.PixelConverter;

/**
 * @author ylcyouth
 * @create 2019/6/8 19:12
 */
public class T implements Runnable{

    @Override
    public void run() {

        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + ": " + PixelConverter.Argb.instance);
    }
}
