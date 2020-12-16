package model;

/**
 * Description: <br/>
 * 每一个人都有姓名，号码，性别。姓名和号码可以重叠，但是ID是唯一的，所以项目的功能实现应该都是基于ID。
 * 
 * @author Yun Zhou 300442776
 * @version
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

}
