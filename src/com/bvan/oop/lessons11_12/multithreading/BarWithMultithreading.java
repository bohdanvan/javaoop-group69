package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class BarWithMultithreading {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        new Thread(new Drinker(1)).start();
        new Thread(new Drinker(2)).start();
        new Thread(new Drinker(3)).start();

        ThreadUtils.println("Bar is closed");
    }
}
