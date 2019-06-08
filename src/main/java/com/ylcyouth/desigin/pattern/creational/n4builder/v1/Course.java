package com.ylcyouth.desigin.pattern.creational.n4builder.v1;

/**
 * @author ylcyouth
 * @create 2019/6/8 16:03
 */
public class Course {
    private String courseName;
    private String courseVideo;
    private String coursePPT;
    private String courseArticle;

    private String courseQuestionAndAnswer;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public String getCourseArticle() {
        return courseArticle;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    public String getCourseQuestionAndAnswer() {
        return courseQuestionAndAnswer;
    }

    public void setCourseQuestionAndAnswer(String courseQuestionAndAnswer) {
        this.courseQuestionAndAnswer = courseQuestionAndAnswer;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQuestionAndAnswer='" + courseQuestionAndAnswer + '\'' +
                '}';
    }
}
