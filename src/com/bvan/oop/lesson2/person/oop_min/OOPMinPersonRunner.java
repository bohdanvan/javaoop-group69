package com.bvan.oop.lesson2.person.oop_min;

/**
 * @author bvanchuhov
 */
public class OOPMinPersonRunner {

    public static void main(String[] args) {
        Person person = new Person("Taras", 25);
        String info = person.sayHello();
        System.out.println(info);
    }
}
