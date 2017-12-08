package com.bvan.oop.lesson3.rectangle;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class Rectangles {

    private final ArrayList<Rectangle> rectangles = new ArrayList<>();

    public void add(Rectangle rect) {
        rectangles.add(rect);
    }

    public int sumArea() {
        int sumArea = 0;
        for (Rectangle rectangle : rectangles) {
            sumArea += rectangle.getArea();
        }
        return sumArea;
    }
}