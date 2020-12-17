package model;

import java.util.HashMap;
import java.util.Map;

import model.course.Course;

public class Student extends Person {
    private Map<Course, Integer> courseMarks_map;

    /**
     * A constructor. It construct a new instance of Student.
     *
     * @param name
     *            name of the person
     * @param id
     *            id of the person, it's unique
     * @param isMale
     *            true for male, false for female
     */
    public Student(String name, int id, boolean isMale) {
        super(name, id, isMale);
        setCourseMarks_map(new HashMap<Course, Integer>());
    }

    public void enrollCourse(Course courseToEnroll) {
        if (courseToEnroll == null) {
            throw new IllegalArgumentException("Must enter the course name and id");
        }
        // 应该做一个检查，检查在数据库里有没有这个课存在
        boolean isExist = false;
        // for (Course courseToCompare : allCoursesData) {
        // if (courseToEnroll.equals(courseToCompare)) {
        // isExist=true;
        // break;
        // }
        // }
        if (!isExist) {
            System.err.println("Course not found, please re-enter the course name ");
        }
        super.courses.add(courseToEnroll);
    }

    public void removeCourse(Course courseToRemove) {
        if (courseToRemove == null) {
            throw new IllegalArgumentException("Must enter the course name and id");
        }
        super.courses.remove(courseToRemove);
    }

    public void showAllCoursesMarks() {

        for (Course course : super.courses) {

        }
    }

    /**
     * Get the courseMarks_map.
     *
     * @return  the courseMarks_map
     */
    public Map<Course, Integer> getCourseMarks_map() {
        return courseMarks_map;
    }

    /**
     * Set the courseMarks_map.
     *
     * @param   courseMarks_map    the courseMarks_map to set
     */
    public void setCourseMarks_map(Map<Course, Integer> courseMarks_map) {
        this.courseMarks_map = courseMarks_map;
    }

}
