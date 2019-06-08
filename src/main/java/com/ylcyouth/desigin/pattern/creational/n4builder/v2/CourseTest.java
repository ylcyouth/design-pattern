package com.ylcyouth.desigin.pattern.creational.n4builder.v2;

/**
 * @author ylcyouth
 * @create 2019/6/8 17:20
 */
public class CourseTest {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .buildCourseName("Python课程")
                .buildCourseVideo("Python课程Video")
                .buildCoursePPT("Python课程PPT")
                .buildCourseArticle("Python课程article")
                .buildCourseQuestionAndAnswer("Python课程question&answer")
                .buildCourse();

        System.out.println(course);
    }
}
