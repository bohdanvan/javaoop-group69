package com.bvan.oop.lesson3.rectangle;

/**
 * @author bvanchuhov
 */
public class RectangleRunner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20); // 200
        System.out.println(rectangle);

        Rectangles rectangles = new Rectangles();
        rectangles.add(rectangle);
        rectangles.add(new Rectangle(30, 10)); // 300

        int area = rectangles.sumArea();
        System.out.println("area = " + area);
    }
}
