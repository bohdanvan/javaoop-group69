package com.bvan.oop.lesson7.sorting;

import java.util.Comparator;

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return Integer.compare(a.length(), b.length());
    }
}

