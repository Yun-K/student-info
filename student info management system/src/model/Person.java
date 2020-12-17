package model;

import java.util.Set;

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

}
