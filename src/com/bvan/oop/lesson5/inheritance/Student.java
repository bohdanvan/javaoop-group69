package com.bvan.oop.lesson5.inheritance;

/**
 * @author bvanchuhov
 */
public class Student extends Person {

    private final String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    public void study() {
        System.out.println("I'm " + getName() + " from " + university + ". " +
                "And I study hardly");
    }

    @Override
    public void sayHello() {
        System.out.println("I'm student");
    }
}
