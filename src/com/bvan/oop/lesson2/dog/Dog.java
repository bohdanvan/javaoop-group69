package com.bvan.oop.lesson2.dog;

/**
 * @author bvanchuhov
 */
public class Dog {

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println("Gav-gav, " + name);
    }

    public void bark(int times) {
        for (int i = 0; i < times; i++) {
            bark();
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
