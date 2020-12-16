package model;

import java.util.Set;

/**
 * Description: <br/>
 * 课程分为号码和名字，比如CYBR271， CYBR指的是网络安全，号码是271。除此之外，每课都有对应的一个或多个老师负责。
 * 
 * @author Yun Zhou 300442776
 * @version
 */
public class Course {

    /**
     * name of the course.
     */
    private String name;

    /**
     * the course id.
     */
    private String id;

    /**
     * a set of teachers.
     */
    private Set<Teacher> courseTeachers;

    public final String toString() {
        return name + id;
    }
}
