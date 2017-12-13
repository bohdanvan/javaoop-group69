package com.bvan.oop.lesson4.shape.runner;

import com.bvan.oop.lesson4.shape.Circle;
import com.bvan.oop.lesson4.shape.EquilateralTriangle;
import com.bvan.oop.lesson4.shape.Rectangle;
import com.bvan.oop.lesson4.shape.Shape;

/**
 * @author bvanchuhov
 */
public class PolymorphismRunner {

    public static void main(String[] args) {
        Shape s1 = new Rectangle(10.0, 20.0);
        printShapeInfo(s1);

        Shape s2 = new Circle(10.0);
        printShapeInfo(s2);

        printShapeInfo(new EquilateralTriangle(10.0));
    }

    private static void printShapeInfo(Shape s) {
        double perimeter = s.getPerimeter();
        double area = s.getArea();

        System.out.println("P = " + perimeter);
        System.out.println("S = " + area);
        System.out.println();
    }
}
