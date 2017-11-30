package com.bvan.oop.lesson1.dynamicarray.proc;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ReadIntTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = ProcDynamicArrayApp.readInt(scanner);
        System.out.println("n = " + n);
    }
}
