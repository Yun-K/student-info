package model.course;

import java.util.Map;

import model.Person;
import model.Student;

public class Marks {

    public void setMarks(Person student, Course course, int CourseMarks) {
        if (!(student instanceof Student)) {
            System.err.println("this person is the teacher, not the student, cannot set marks");
            return;
        }

        boolean isFound = false;
        for (Course courseToFind : student.getCourses()) {
            if (courseToFind.equals(course)) {
                isFound = true;
            }

        }

        if (!isFound) {
            System.err.println("The student: " + student.getName()
                               + " don't have this Course!\nReenter the course.");
            return;
        }

        Map<Course, Integer> studentCourseMarkMap = ((Student) student).getCourseMarks_map();

    }

}
