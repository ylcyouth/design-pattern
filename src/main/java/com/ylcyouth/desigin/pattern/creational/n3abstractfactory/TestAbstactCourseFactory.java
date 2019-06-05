package com.ylcyouth.desigin.pattern.creational.n3abstractfactory;

/**
 * @author ylcyouth
 * @create 2019/6/5 23:49
 */
public class TestAbstactCourseFactory {

    public static void main(String[] args) {

        //抽象产品族工厂
        AbstractCourseFacotry courseFacotry = null;

        //具体产品族工厂
        //用抽象工厂的引用接收创建的具体工厂
        //courseFacotry = new JavaCourseFacotry();
        courseFacotry = new PythonCourseFacotry();

        //具体产品
        //用抽象产品的引用接具体工厂创建的具体产品
        Video video = courseFacotry.getVideo();
        Article article = courseFacotry.getArticle();

        video.produce();
        article.produce();




    }
}
