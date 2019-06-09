package com.ylcyouth.desigin.pattern.creational.p5_singleton.p10_relectionproblem;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ylcyouth
 * @create 2019/6/9 11:54
 *
 * 演示序列化和反序列化破坏单例的问题
 *
 */
public class TestSerializationProblem {

    public static void main(String[] args) throws IOException, ClassNotFoundException,
            NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {


        HungrySingleton instance = HungrySingleton.getInstance();

        Class<HungrySingleton> objectClass = HungrySingleton.class;
        Constructor<HungrySingleton> constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        HungrySingleton newInstance = constructor.newInstance();


        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);

    }
}
