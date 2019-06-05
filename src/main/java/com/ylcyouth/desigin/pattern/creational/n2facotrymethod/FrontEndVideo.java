package com.ylcyouth.desigin.pattern.creational.n2facotrymethod;

/**
 * @author ylcyouth
 * @create 2019/6/5 22:28
 */
public class FrontEndVideo implements Video {


    @Override
    public void produce() {
        System.out.println("录制front end视频");
    }
}
