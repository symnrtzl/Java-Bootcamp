package DataAccess.CourseDAO;

import Entities.Course;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile  "+course.getCourseName() +"kursu ekledi.");
    }
}
