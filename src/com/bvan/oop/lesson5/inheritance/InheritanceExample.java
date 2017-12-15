package com.bvan.oop.lesson5.inheritance;

/**
 * @author bvanchuhov
 */
public class InheritanceExample {

    public static void main(String[] args) {
//        Person p1 = new Person("Petya", 45);
//        p1.sayHello();
//
//        Person p2 = new Person("Vasya", 60);
//        p2.sayHello();

        Person p3 = new Developer("Ivan", 30, "Google");
        p3.sayHello();

        Developer d1 = new Developer("Maria", 25, "Facebook");
        d1.writeCode();

        Person p4 = new Student("Vadim", 18, "KPI");
        p4.sayHello();
    }
}

