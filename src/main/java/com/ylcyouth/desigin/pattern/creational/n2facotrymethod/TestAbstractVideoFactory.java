package com.ylcyouth.desigin.pattern.creational.n2facotrymethod;

/**
 * @author ylcyouth
 * @create 2019/6/5 22:25
 */
public class TestAbstractVideoFactory {

    public static void main(String[] args) {
        AbstractVideoFactory videoFactory = null;

        //videoFactory = new JavaVideoFacotry();
        //videoFactory = new PythonVideoFactory();
        videoFactory = new FrontEndVideoFacotry();

        Video video = videoFactory.getVideo();
        video.produce();

    }
}
