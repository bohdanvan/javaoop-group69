package com.bvan.oop.lesson9.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class SetExample {

    public static void main(String[] args) {
        List<String> langs = langs();

        Set<String> uniqueLangs = new LinkedHashSet<>();
        for (String lang : langs) {
            uniqueLangs.add(lang);
        }

        System.out.println(uniqueLangs);

        System.out.println(uniqueLangs.contains("Java"));
        System.out.println(uniqueLangs.contains("Python"));
    }

    private static List<String> langs() {
        return Arrays.asList(
                "Java",
                "C#",
                "Kotlin",
                "C#",
                "Java",
                "Java",
                "Kotlin",
                "JavaScript",
                "Kotlin",
                "C#",
                "C#",
                "C++",
                "Java",
                "JavaScript",
                "C#",
                "JavaScript"
        );
    }
}
