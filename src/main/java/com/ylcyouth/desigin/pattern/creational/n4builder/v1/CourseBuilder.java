package com.ylcyouth.desigin.pattern.creational.n4builder.v1;

/**
 * @author ylcyouth
 * @create 2019/6/8 16:07
 */
public abstract class CourseBuilder {
    public abstract void buildCourseName(String courseName);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQuestionAndAnswer(String courseQuestionAndAnswer);

    public abstract Course buildCourse();
}
