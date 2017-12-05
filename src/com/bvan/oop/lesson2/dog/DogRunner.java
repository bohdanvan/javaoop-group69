package com.bvan.oop.lesson2.dog;

/**
 * @author bvanchuhov
 */
public class DogRunner {

    public static void main(String[] args) {
        Dog rex = new Dog("Rex");
        rex.bark(10);
        System.out.println();

        Owner alex = new Owner("Alex", rex);
        alex.giveCommand();
    }
}
