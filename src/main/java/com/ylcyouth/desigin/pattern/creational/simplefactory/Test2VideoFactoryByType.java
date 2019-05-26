package com.ylcyouth.desigin.pattern.creational.simplefactory;

import com.ylcyouth.desigin.pattern.creational.simplefactory.abstractclass.Video;

/**
 * @author wjj
 * @create 2019/5/26 16:45
 */
public class Test2VideoFactoryByType {

    public static void main(String[] args) {
        VideoFactory factory = new VideoFactory();

        Video video = factory.getVideo("Java");
        video.produce();

        Video video1 = factory.getVideo("Python");
        video1.produce();
    }
}
