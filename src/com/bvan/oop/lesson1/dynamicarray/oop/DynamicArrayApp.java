package com.bvan.oop.lesson1.dynamicarray.oop;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class DynamicArrayApp {

    public static void main(String[] args) {
        DynamicArray elems = readClientElemsFromConsole();
        System.out.println(elems.toString());
    }

    private static DynamicArray readClientElemsFromConsole() {
        RepeatableReader reader = new RepeatableReader(System.in);

        DynamicArray elems = new DynamicArray(8);

        int n = reader.readInt();
        while (n != 0) {
            elems.addLast(n);

            n = reader.readInt();
        }
        return elems;
    }
}
