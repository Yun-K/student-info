package model;

import java.util.Set;

import model.course.Course;

/**
 * Description: <br/>
 * 每一个人都有姓名，号码，性别。姓名和号码可以重叠，但是ID是唯一的，所以项目的功能实现应该都是基于ID。
 * 
 * @author Yun Zhou 300442776
 */
public abstract class Person {
    /**
     * every person got the name.
     */
    protected String name;

    /**
     * the id is unique.
     */
    protected int id;

    /** Password of the account */
    private String password;

    /**
     * either Male or Female.
     */
    protected boolean gender;

    /**
     * Courses that the person have/teach
     */
    protected Set<Course> courses;

    /**
     * A constructor. It construct a new instance of Person.
     *
     * @param name
     *            name of the person
     * @param id
     *            id of the person, it's unique
     * @param isMale
     *            true for male, false for female
     */
    public Person(String name, int id, boolean isMale) {
        this.name = name;
        this.id = id;
        this.gender = isMale;
    }

    /**
     * Get the name.
     *
     * @return the name
     */
    public final String getName() {
        return name;
    }

    /**
     * Get the id.
     *
     * @return the id
     */
    public final int getId() {
        return id;
    }

    /**
     * Get the gender.
     *
     * @return the gender
     */
    public final String getGender() {
        if (gender) {
            return "male";

        }
        return "female";
    }

    /**
     * Get the courses.
     *
     * @return the courses
     */
    public final Set<Course> getCourses() {
        return courses;
    }

    /**
     * Set the name.
     *
     * @param name
     *            the name to set
     */
    public final void setName(String name) {
        this.name = name;
    }

    /**
     * Set the id.
     *
     * @param id
     *            the id to set
     */
    public final void setId(int id) {
        this.id = id;
    }

    /**
     * Set the gender.
     *
     * @param gender
     *            the gender to set
     */
    public final void setGender(boolean gender) {
        this.gender = gender;
    }

    /**
     * Set the courses.
     *
     * @param courses
     *            the courses to set
     */
    public final void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    /**
     * Get the password.
     *
     * @return the password
     */
    public final String getPassword() {
        return password;
    }

    /**
     * Set the password.
     *
     * @param password
     *            the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
