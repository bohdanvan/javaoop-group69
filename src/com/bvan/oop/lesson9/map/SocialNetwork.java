package com.bvan.oop.lesson9.map;

import com.bvan.oop.common.Person;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author bvanchuhov
 */
public class SocialNetwork {

    public static void main(String[] args) {
        Map<Long, Person> idToUserMap = new TreeMap<>();

        idToUserMap.put(200L, new Person("Tanya", 20));
        idToUserMap.put(100L, new Person("Taras", 25)); // O(1)
        idToUserMap.put(200L, new Person("Vlad", 40));
        idToUserMap.put(500L, new Person("Ivan", 30));

        Person person = idToUserMap.get(200L); // O(1)
        System.out.println(person);

        boolean containsValue =
                idToUserMap.containsValue(new Person("Vlad", 40)); // O(N)
        System.out.println(containsValue);

        Set<Long> keys = idToUserMap.keySet();
        for (Long key : keys) {
            System.out.println(key);
        }

        Collection<Person> values = idToUserMap.values();

        Set<Map.Entry<Long, Person>> entries = idToUserMap.entrySet();
        for (Map.Entry<Long, Person> entry : entries) {
            Long id = entry.getKey();
            Person user = entry.getValue();
            System.out.println("id = " + id + ", user = " + user);
        }
    }
}
