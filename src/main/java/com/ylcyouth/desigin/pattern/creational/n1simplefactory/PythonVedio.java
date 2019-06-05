package com.ylcyouth.desigin.pattern.creational.n1simplefactory;

/**
 * @author wjj
 * @create 2019/5/26 16:26
 */
public class PythonVedio extends Video {
    /**
     * video抽象类录视频的方法
     */
    @Override
    public void produce() {
        System.out.println("录制Python视频课程");
    }
}
