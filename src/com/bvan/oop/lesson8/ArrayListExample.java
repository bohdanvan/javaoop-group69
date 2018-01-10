package com.bvan.oop.lesson8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println(list.size());
        System.out.println(list);

        list.add(100);
    }
}
