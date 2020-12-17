package model;

public class Student extends Person {
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
        // TODO Auto-generated constructor stub
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

}
