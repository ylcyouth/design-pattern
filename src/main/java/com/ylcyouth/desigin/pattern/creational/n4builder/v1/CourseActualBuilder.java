package com.ylcyouth.desigin.pattern.creational.n4builder.v1;

/**
 * @author ylcyouth
 * @create 2019/6/8 16:11
 */
public class CourseActualBuilder extends CourseBuilder {

    private Course course = new Course();

    @Override
    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    @Override
    public void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void buildCourseQuestionAndAnswer(String courseQuestionAndAnswer) {
        course.setCourseQuestionAndAnswer(courseQuestionAndAnswer);
    }

    @Override
    public Course buildCourse() {
        return course;
    }
}
