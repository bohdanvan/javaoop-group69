package com.bvan.oop.lesson2.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author bvanchuhov
 */
public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = ld1.minusYears(100);

        System.out.println("ld1 = " + ld1);
        System.out.println("ld2 = " + ld2);
    }
}
