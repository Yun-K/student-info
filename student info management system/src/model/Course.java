package model;

import java.util.Set;

/**
 * Description: <br/>
 * 课程分为号码和名字，比如CYBR271， CYBR指的是网络安全，号码是271。除此之外，每课都有对应的一个或多个老师负责。
 * 
 * @author Yun Zhou 300442776
 */
public class Course {

    /**
     * A constructor. It construct a new instance of Course.
     *
     * @param courseName
     *            name of the course
     * @param courseID
     *            id of the course
     */
    public Course(String courseName, int courseID) {
        fullName = courseName + courseID;
    }

    /**
     * the full name of the course.
     */
    private String fullName;

    /**
     * information of the Course, including the whole name, teacher, etc.
     */
    private String courseInfo;

    /**
     * a set of teachers.
     */
    private Set<Teacher> courseTeachers;

    /**
     * a set of students who enroll the course.
     */
    private Set<Student> courseStudents;

    /**
     * Get the fullName.
     *
     * @return the fullName
     */
    public final String getCourseFullName() {
        return fullName;
    }

    /**
     * Get the courseTeachers.
     *
     * @return the courseTeachers
     */
    public final Set<Teacher> getCourseTeachers() {
        return courseTeachers;
    }

    /**
     * Get the courseStudents.
     *
     * @return the courseStudents
     */
    public final Set<Student> getCourseStudents() {
        return courseStudents;
    }

    /**
     * Set the courseInfo.
     *
     * @param courseInfo
     *            the courseInfo to set
     */
    public final void setCourseInfo(String courseInfo) {
        this.courseInfo = courseInfo;
    }

    /**
     * Set the courseTeachers.
     *
     * @param courseTeachers
     *            the courseTeachers to set
     */
    public final void setCourseTeachers(Set<Teacher> courseTeachers) {
        this.courseTeachers = courseTeachers;
    }

    /**
     * Set the courseStudents.
     *
     * @param courseStudents
     *            the courseStudents to set
     */
    public final void setCourseStudents(Set<Student> courseStudents) {
        this.courseStudents = courseStudents;
    }

    public final void addCourseTeacher(Teacher teacherToAdd) {
        courseTeachers.add(teacherToAdd);
    }

    public final void removeCourseTeacher(Teacher teacherToRemove) {
        courseTeachers.remove(teacherToRemove);
    }

    /**
     * Description: <br/>
     * Enroll the student into the set of Course students.
     * 
     * @author Yun Zhou
     * @param studentToAdd
     *            student to add
     */
    public final void enrollStudent(Student studentToAdd) {
        courseStudents.add(studentToAdd);
    }

    /**
     * Description: <br/>
     * Remove the student from the set of the Course.
     * 
     * @author Yun Zhou
     * @param studentToRemove
     *            student to remove
     */
    public final void removeStudent(Student studentToRemove) {
        courseStudents.remove(studentToRemove);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
        return result;
    }

    /**
     * Override the equals by comparing the fullName of the course.
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Course)) {
            return false;
        }
        Course other = (Course) obj;
        if (fullName == null) {
            if (other.fullName != null) {
                return false;
            }
        } else if (!fullName.equals(other.fullName)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String teachers = "\n\t";
        for (Teacher t : courseTeachers) {
            teachers += t.toString() + "\n";
        }
        return fullName + " :\n\tTeacher: " + teachers + "\n\tCourse Info:\n\t"
               + courseInfo;
    }
}
