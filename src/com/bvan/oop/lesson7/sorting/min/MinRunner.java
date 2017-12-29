package com.bvan.oop.lesson7.sorting.min;

import com.bvan.oop.common.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class MinRunner {

    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(30, 20, 45);
        List<String> names = Arrays.asList("John", "Bob", "Phil");
        List<Person> people = Arrays.asList(
                new Person("Jo", 25),
                new Person("Bob", 30),
                new Person("Phil", 20)
        );

        System.out.println(Min.min(ages)); // 20
        System.out.println(Min.min(names)); // "Bob"

        Comparator<Person> ageComparator = new AgeComparator();
        Person min = Min.min(people, ageComparator);
        System.out.println(min);

        Person min1 = Min.min(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(min1);

        Comparator<Person> nameLengthComparator =
                (a, b) ->
                        Integer.compare(
                            a.getName().length(),
                            b.getName().length()
                        );

        Person min2 = Min.min(people, nameLengthComparator);
        System.out.println(min2);
    }
}

class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}