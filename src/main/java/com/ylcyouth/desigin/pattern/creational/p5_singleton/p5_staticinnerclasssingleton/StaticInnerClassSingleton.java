package com.ylcyouth.desigin.pattern.creational.p5_singleton.p5_staticinnerclasssingleton;

/**
 * @author ylcyouth
 * @create 2019/6/8 21:40
 *
 * 如果不锁类的class文件就面临着重排序的问题
 * 解决方法2：不让其他线程看到，正在初始化instance的线程的重排序
 *
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {}

    private static class InnerClass {
        public static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.instance;
    }

}
