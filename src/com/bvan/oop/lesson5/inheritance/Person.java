package com.bvan.oop.lesson5.inheritance;

/**
 * @author bvanchuhov
 */
public abstract class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void sayHello();

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }
}
