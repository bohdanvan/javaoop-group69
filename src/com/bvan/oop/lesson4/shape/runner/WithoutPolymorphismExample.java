package com.bvan.oop.lesson4.shape.runner;

import com.bvan.oop.lesson4.shape.Circle;
import com.bvan.oop.lesson4.shape.Rectangle;

/**
 * @author bvanchuhov
 */
public class WithoutPolymorphismExample {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10.0, 20.0);
        printRectangeInfo(r);

        Circle c = new Circle(10.0);
        printCircleInfo(c);
    }

    private static void printCircleInfo(Circle c) {
        double perimeter = c.getPerimeter();
        double area = c.getArea();

        System.out.println("P = " + perimeter);
        System.out.println("S = " + area);
        System.out.println();
    }

    private static void printRectangeInfo(Rectangle r) {
        double perimeter = r.getPerimeter();
        double area = r.getArea();

        System.out.println("P = " + perimeter);
        System.out.println("S = " + area);
        System.out.println();
    }

}
