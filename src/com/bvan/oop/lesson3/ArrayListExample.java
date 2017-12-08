package com.bvan.oop.lesson3;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ArrayListExample {

    public static void main(String[] args) {
        int[] a = new int[10];

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        System.out.println(list);

        Integer elem = list.get(1);
        System.out.println(elem);

        list.add(1, 300);
        System.out.println(list);

        list.set(1, 400);
        System.out.println(list);

        for (int e : list) {
            System.out.println(e);
        }
    }
}
