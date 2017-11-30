package com.bvan.oop.lesson1.dynamicarray.proc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ProcDynamicArrayApp {

    public static void main(String[] args) {
        int[] elems = readClientElemsFromConsole();
        int sum = sum(elems);

        System.out.println(Arrays.toString(elems));
        System.out.println("sum = " + sum);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }

    private static int[] readClientElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        int[] elems = new int[4];
        int size = 0;

        int n = readInt(scanner);
        while (n != 0) {
            if (size == elems.length) {
                int newLength = (int) (1.5 * elems.length);
                elems = Arrays.copyOf(elems, newLength);
            }
            elems[size] = n;
            size++;

            n = readInt(scanner);
        }
        return Arrays.copyOf(elems, size);
    }

    public static int readInt(Scanner scanner) {
        System.out.print(">> ");

        while (!scanner.hasNextInt()) {
            scanner.next(); // skip

            System.out.println("Illegal input");
            System.out.print(">> ");
        }

        return scanner.nextInt();
    }

    private static int[] addLastElem(int[] elems, int n) {
        int[] newElems = Arrays.copyOf(elems, elems.length + 1);
        newElems[newElems.length - 1] = n;
        return newElems;
    }
}
