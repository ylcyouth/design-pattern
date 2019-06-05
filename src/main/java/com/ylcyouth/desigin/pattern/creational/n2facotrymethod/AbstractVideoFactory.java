package com.ylcyouth.desigin.pattern.creational.n2facotrymethod;

/**
 * @author ylcyouth
 * @create 2019/6/5 22:19
 */
public abstract class AbstractVideoFactory {

    /**
     * 生产Video类型对象的抽象方法
     * @return
     */
    public abstract Video getVideo();
}
