package com.bvan.oop.lesson7.object;

/**
 * @author bvanchuhov
 */
public class ObjectExample {

    public static void main(String[] args) {
        Student taras = new Student("Taras", "taras@gmail.com");
        System.out.println(taras.toString());

        Object o1 = taras;
        System.out.println(o1.toString());

        Object o2 = "Java";

    }
}

class Student extends Object {

    private final String name;
    private final String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
