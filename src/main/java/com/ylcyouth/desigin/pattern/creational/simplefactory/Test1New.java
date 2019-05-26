package com.ylcyouth.desigin.pattern.creational.simplefactory;

import com.ylcyouth.desigin.pattern.creational.simplefactory.abstractclass.Video;
import com.ylcyouth.desigin.pattern.creational.simplefactory.object.JavaVideo;
import com.ylcyouth.desigin.pattern.creational.simplefactory.object.PythonVedio;

/**
 * @author wjj
 * @create 2019/5/26 16:43
 */
public class Test1New {

    public static void main(String[] args) {
        Video video = new JavaVideo();
        video.produce();

        Video video1 = new PythonVedio();
        video1.produce();
    }
}
