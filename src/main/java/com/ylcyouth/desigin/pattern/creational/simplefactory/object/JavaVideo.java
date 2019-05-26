package com.ylcyouth.desigin.pattern.creational.simplefactory.object;

import com.ylcyouth.desigin.pattern.creational.simplefactory.abstractclass.Video;

/**
 * @author wjj
 * @create 2019/5/26 16:24
 */
public class JavaVideo extends Video {


    /**
     * video抽象类录视频的方法
     */
    @Override
    public void produce() {
        System.out.println("录制Java视频课程");
    }
}
