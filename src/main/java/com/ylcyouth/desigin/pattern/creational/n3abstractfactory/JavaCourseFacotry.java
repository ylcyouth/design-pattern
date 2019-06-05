package com.ylcyouth.desigin.pattern.creational.n3abstractfactory;

/**
 * @author ylcyouth
 * @create 2019/6/5 23:48
 */
public class JavaCourseFacotry extends AbstractCourseFacotry {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
