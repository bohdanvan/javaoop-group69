package com.bvan.oop.lesson5.inheritance;

/**
 * @author bvanchuhov
 */
public class Developer extends Person {

    private final String company;

    public Developer(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    @Override
    public void sayHello() {
        System.out.println("I'm developer " + getName());
    }

    public void writeCode() {
        System.out.println("I write code");
    }

    public String getCompany() {
        return company;
    }
}
