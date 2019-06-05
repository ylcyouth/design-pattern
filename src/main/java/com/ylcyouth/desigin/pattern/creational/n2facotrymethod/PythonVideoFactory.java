package com.ylcyouth.desigin.pattern.creational.n2facotrymethod;

/**
 * @author ylcyouth
 * @create 2019/6/5 22:24
 */
public class PythonVideoFactory extends AbstractVideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVedio();
    }
}
