package com.ylcyouth.desigin.pattern.creational.n1simplefactory;

/**
 * @author wjj
 * @create 2019/5/26 16:27
 */
public class VideoFactory {

    public static final String JAVA = "java";
    public static final String PYTHON = "python";

    /**
     * 通过if判断对象的标记创建对象
     * 这种方式可以是应用代码不依赖各种需要工厂创建对象的类，但是违背了开闭原则，扩展性差, 要生产新的类的话就要改判断逻辑
     *
     * 这里的if判断不能使用switch，因为switch(x)这个x只能是 char, byte, short or int
     *
     * @param type 需要创建的类的标记
     */
    public Video getVideo(String type) {

        if (JAVA.equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if (PYTHON.equalsIgnoreCase(type)) {
            return new PythonVedio();
        }
        return null;
    }

    /**
     * 使用反射创建对象，弥补工厂方法扩展性弱的缺点
     * 这种方式应用代码还得依赖需要各种需要工厂创建对象的类，但是扩展性很好，即使要生产新的类，也不用改这个里面的代码
     *
     * @param c 需要创建的类的Class
     */
    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
