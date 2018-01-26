package com.bvan.oop.lessons11_12.multithreading.daemon;

import com.bvan.oop.lessons11_12.multithreading.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class DaemonExample {

    public static void main(String[] args) throws InterruptedException {
        Thread musicThread = new Thread(new MusicTask());
        musicThread.setDaemon(true);
        musicThread.start();

        Thread.sleep(5000);

        ThreadUtils.println("Main is finished");
    }
}
