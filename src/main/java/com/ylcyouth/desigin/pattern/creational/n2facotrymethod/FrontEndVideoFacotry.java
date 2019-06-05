package com.ylcyouth.desigin.pattern.creational.n2facotrymethod;

/**
 * @author ylcyouth
 * @create 2019/6/5 22:30
 */
public class FrontEndVideoFacotry extends AbstractVideoFactory {

    @Override
    public Video getVideo() {
        return new FrontEndVideo();
    }
}
