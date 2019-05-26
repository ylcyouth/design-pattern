package com.ylcyouth.desigin.pattern.creational.simplefactory;

import com.ylcyouth.desigin.pattern.creational.simplefactory.abstractclass.Video;
import com.ylcyouth.desigin.pattern.creational.simplefactory.object.JavaVideo;
import com.ylcyouth.desigin.pattern.creational.simplefactory.object.PythonVedio;

/**
 * @author wjj
 * @create 2019/5/26 16:53
 */
public class Test3VideoFactoryByClass {

    public static void main(String[] args) {
        VideoFactory factory = new VideoFactory();

        Video video = factory.getVideo(JavaVideo.class);
        video.produce();

        Video video1 = factory.getVideo(PythonVedio.class);
        video1.produce();
    }
}
