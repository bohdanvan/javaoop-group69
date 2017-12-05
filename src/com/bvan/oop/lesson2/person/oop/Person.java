package com.bvan.oop.lesson2.person.oop;

/**
 * @author bvanchuhov
 */
public class Person {

    private final String name; // field
    private final int age;

    // static factory method
    public static Person createWithAge(int age) {
        return new Person(age);
    }

    public Person(String name, int age) {
        checkAge(age);

        this.name = name;
        this.age = age;
    }

    private void checkAge(int age) {
        if (!isAge(age)) {
            throw new IllegalArgumentException("illegal age: " + age);
        }
    }

    public Person(int age) {
        this("undefined", age);
    }

    private boolean isAge(int n) {
        return n >= 1 && n <= 120;
    }

    public String sayHello() {
        return "Hello, I'm " + name + ", "
                + age + " years old";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person changeAge(int newAge) {
        return new Person(this.name, newAge);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
