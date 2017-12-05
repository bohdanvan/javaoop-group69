package com.bvan.oop.lesson2.person.proc;

/**
 * @author bvanchuhov
 */
public class ProcPersonRunner {

    public static void main(String[] args) {
        ProcPerson p = new ProcPerson();
        p.name = "Taras";
        p.age = 25;

        String info = getPersonInfo(p);

        System.out.println(info);

        // -----

        ProcPerson p2 = new ProcPerson();
        p2.name = "Ivan";
        p2.age = 30;

        String info2 = getPersonInfo(p2);

        System.out.println(info2);
    }

    private static String getPersonInfo(ProcPerson person) {
        return "Hello, I'm " + person.name + ", " + person.age + " years old";
    }
}
