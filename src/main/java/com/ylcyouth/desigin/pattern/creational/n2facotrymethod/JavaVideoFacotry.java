package com.ylcyouth.desigin.pattern.creational.n2facotrymethod;

/**
 * @author ylcyouth
 * @create 2019/6/5 22:22
 */
public class JavaVideoFacotry extends AbstractVideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVedio();
    }
}
