package com.bvan.oop.lessons11_12.multithreading.daemon;

import com.bvan.oop.lessons11_12.multithreading.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class MusicTask implements Runnable {

    @Override
    public void run() {
        while (true) {
            ThreadUtils.println("Music...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
