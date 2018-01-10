package com.bvan.oop.lesson8.iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class IterationExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Taras");
        names.add("Ivan");
        names.add("Vlad");

        for (String name : names) {
            System.out.println(name);
        }

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
