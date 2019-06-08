package com.ylcyouth.desigin.pattern.creational.n4builder.v2;

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

    public Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.courseVideo = courseBuilder.courseVideo ;
        this.coursePPT = courseBuilder.coursePPT ;
        this.courseArticle = courseBuilder.courseArticle ;
        this.courseQuestionAndAnswer = courseBuilder.courseQuestionAndAnswer ;
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

    public static class CourseBuilder {
        private String courseName;
        private String courseVideo;
        private String coursePPT;
        private String courseArticle;

        private String courseQuestionAndAnswer;

        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder buildCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuilder buildCourseQuestionAndAnswer(String courseQuestionAndAnswer) {
            this.courseQuestionAndAnswer = courseQuestionAndAnswer;
            return this;
        }

        public Course buildCourse() {
            return new Course(this);
        }


    }

}
