package com.bvan.oop.lesson8.iteration;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author bvanchuhov
 */
public class Array implements Iterable<Integer> {

    private final int[] elems;

    public Array(int[] elems) {
        this.elems = Arrays.copyOf(elems, elems.length);
    }

    public Array(int size) {
        this.elems = new int[size];
    }

    public void set(int index, int elem) {
        elems[index] = elem;
    }

    public int get(int index) {
        return elems[index];
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ArrayIterator();
    }

    @Override
    public String toString() {
        return Arrays.toString(elems);
    }

    private class ArrayIterator implements Iterator<Integer> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < elems.length;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return elems[currentIndex++];
        }

    }
}
