package com.bvan.oop.lesson7.generic.box.good;

import com.bvan.oop.lesson7.generic.box.Cat;
import com.bvan.oop.lesson7.generic.box.Dog;

/**
 * @author bvanchuhov
 */
public class BoxRunner {

    public static void main(String[] args) {
        Box<Cat> catBox = new Box<>(new Cat());
        Box<Dog> dogBox = new Box<>(new Dog());
        Box<String> nameBox = new Box<>("Taras");

        Cat cat = catBox.get();
        cat.meow();

        Dog dog = dogBox.get();
        dog.bark();

        sendBox(catBox);
    }

    private static void sendBox(Box<Cat> catBox) {
        Cat cat = catBox.get();
        cat.meow();
    }
}
