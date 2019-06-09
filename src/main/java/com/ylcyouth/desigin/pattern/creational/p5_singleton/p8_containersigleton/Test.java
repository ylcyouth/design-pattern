package com.ylcyouth.desigin.pattern.creational.p5_singleton.p8_containersigleton;

/**
 * @author ylcyouth
 * @create 2019/6/9 11:46
 */
public class Test {

    public static void main(String[] args) {
        ContainerSingleton.putInstance("a", new Object());
        ContainerSingleton.putInstance("b", new Object());

        System.out.println(ContainerSingleton.getInstance("a"));
        System.out.println(ContainerSingleton.getInstance("b"));
    }
}
