package com.bvan.oop.lesson1.dynamicarray.oop;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class DynamicArray {

    // fields
    int[] elems;
    int size = 0;

    public DynamicArray(int initSize) {
        elems = new int[initSize];
    }

    public DynamicArray() {
        elems = new int[4];
    }


    public void addLast(int n) {
        if (size == elems.length) {
            int newLength = (int) (1.5 * elems.length);
            elems = Arrays.copyOf(elems, newLength);
        }
        elems[size] = n;
        size++;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elems, size));
    }
}
