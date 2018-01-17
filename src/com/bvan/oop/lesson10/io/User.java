package com.bvan.oop.lesson10.io;

import java.io.Serializable;

/**
 * @author bvanchuhov
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;
    private final int age;
    private final String x = null;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
