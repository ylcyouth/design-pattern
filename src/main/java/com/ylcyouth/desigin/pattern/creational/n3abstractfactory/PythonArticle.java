package com.ylcyouth.desigin.pattern.creational.n3abstractfactory;

/**
 * @author ylcyouth
 * @create 2019/6/5 23:45
 */
public class PythonArticle implements Article {
    @Override
    public void produce() {
        System.out.println("编写Python笔记");
    }
}
