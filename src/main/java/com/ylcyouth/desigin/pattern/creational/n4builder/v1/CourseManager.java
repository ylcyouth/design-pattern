package com.ylcyouth.desigin.pattern.creational.n4builder.v1;

/**
 * @author ylcyouth
 * @create 2019/6/8 16:15
 */
public class CourseManager {

    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course buildCourse(String courseName,
                              String courseVideo,
                              String coursePPT,
                              String courseArticle,
                              String courseQuestionAndAnswer) {
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCourseVideo(courseVideo);
        courseBuilder.buildCoursePPT(coursePPT);
        courseBuilder.buildCourseArticle(courseArticle);
        courseBuilder.buildCourseQuestionAndAnswer(courseQuestionAndAnswer);
        return courseBuilder.buildCourse();
    }
}
