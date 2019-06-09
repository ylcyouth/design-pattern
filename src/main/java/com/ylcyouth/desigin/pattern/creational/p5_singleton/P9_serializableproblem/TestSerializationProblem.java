package com.ylcyouth.desigin.pattern.creational.p5_singleton.P9_serializableproblem;

import java.io.*;

/**
 * @author ylcyouth
 * @create 2019/6/9 11:54
 *
 * 演示序列化和反序列化破坏单例的问题
 *
 */
public class TestSerializationProblem {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungrySingleton instance = HungrySingleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
