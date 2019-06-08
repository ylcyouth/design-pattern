package com.ylcyouth.desigin.pattern.creational.p5_singleton.p4_doublechecksingleton;

/**
 * @author ylcyouth
 * @create 2019/6/8 20:23
 *
 * Java语言规范里有一个 intra-thread semantics 规定，所有的线程在执行的时候都要遵守这个规定
 * intra-thread semantics可以保证单线程内的重排序不会影响单线程的执行结果
 * 这个重排序可以提高执行的性能
 *
 * 对比在静态方法上加锁：不管instance是不是null 都只能有一个线程进到getInstance()方法里，其他线程都被锁住
 * 在if判断里面加锁：instance不是null时直接返回，是null的时候在去创建instance
 * 
 * 二次if判断的原因是：在第一次判断的时候为null的时候，往下执行进入到if里面，这时候可能已经有一个线程已经进入到synchronized里面了
 * 正在准备创建初始化instance，创建好了之后instance就不为null了，但是这个时候这个线程就可以进入到synchronized里面了，
 * 在synchronized里面再进行一次判断null，这个时候不是null，不再重新创建了，直接返回
 *
 * 总之double check这种方式既兼顾了性能有保证线程安全
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton instance = null;

    private LazyDoubleCheckSingleton() {}

    public static LazyDoubleCheckSingleton getInstance() {
        // 走到这一行instance不为的时候，可能只是设置了instance指向了一个空的内存地址，这个内存地址中的对象还没有被创建好，
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    // 这一行代码有3个步骤
                    // 1.给这个new的对象分配内存地址
                    // 2.初始化这个对象
                    // 3.设置instance指向刚分配好的内存地址
                    // 坑：2和3可能会被jvm颠倒，重排序
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
