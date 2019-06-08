package com.ylcyouth.desigin.pattern.creational.n4builder.v1;

/**
 * @author ylcyouth
 * @create 2019/6/8 16:21
 */
public class TestCourseBuilder {

    public static void main(String[] args) {

        CourseBuilder courseBuilder = new CourseActualBuilder();

        CourseManager courseManager = new CourseManager();
        courseManager.setCourseBuilder(courseBuilder);

        Course course = courseManager.buildCourse("Java课程",
                "Java视频",
                "Java课程PPT",
                "Java课程Article",
                "Java课程question&answer");

        System.out.println(course);
    }
}
