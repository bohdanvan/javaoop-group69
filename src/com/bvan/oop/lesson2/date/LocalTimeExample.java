package com.bvan.oop.lesson2.date;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author bvanchuhov
 */
public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = lt1.plusHours(2);

        System.out.println("lt1 = " + lt1);
        System.out.println("lt2 = " + lt2);

        System.out.println(lt1.format(DateTimeFormatter.ISO_LOCAL_TIME));
    }
}
