package com.ylcyouth.desigin.pattern.creational.n3abstractfactory;

/**
 * @author ylcyouth
 * @create 2019/6/5 23:44
 */
public class PythonVideo implements Video {

    @Override
    public void produce() {
        System.out.println("录制Python视频");
    }
}
