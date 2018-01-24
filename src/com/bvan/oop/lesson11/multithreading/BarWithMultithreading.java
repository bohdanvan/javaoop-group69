package com.bvan.oop.lesson11.multithreading;

/**
 * @author bvanchuhov
 */
public class BarWithMultithreading {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        Thread drinkerThread = new Thread(new Drinker(1));
        drinkerThread.start();

        try {
            drinkerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadUtils.println("Bar is closed");
    }
}
