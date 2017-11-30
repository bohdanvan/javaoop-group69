package com.bvan.oop.lesson1.dynamicarray.oop;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class RepeatableReader {

    Scanner scanner;

    public RepeatableReader(InputStream inputStream) {
        scanner = new Scanner(inputStream);
    }

    public int readInt() {
        System.out.print(">> ");

        while (!scanner.hasNextInt()) {
            scanner.next(); // skip

            System.out.println("Illegal input");
            System.out.print(">> ");
        }

        return scanner.nextInt();
    }
}
