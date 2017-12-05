package com.bvan.oop.lesson2.person.oop;

/**
 * @author bvanchuhov
 */
public class PersonRunner {
    public static void main(String[] args) {
        Person p = new Person("Taras", 30);
        String info = p.sayHello();
        System.out.println(info);

        String name = p.getName();
        System.out.println("name = " + name);

        System.out.println(p.toString());
    }
}
