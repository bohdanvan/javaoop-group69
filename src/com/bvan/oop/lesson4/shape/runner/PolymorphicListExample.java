package com.bvan.oop.lesson4.shape.runner;

import com.bvan.oop.lesson4.shape.Circle;
import com.bvan.oop.lesson4.shape.EquilateralTriangle;
import com.bvan.oop.lesson4.shape.Rectangle;
import com.bvan.oop.lesson4.shape.Shape;
import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class PolymorphicListExample {

    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();
        shapes.add(new EquilateralTriangle(10.0));
        shapes.add(new Rectangle(10.0, 20.0));
        shapes.add(new Circle(10.0));

        Shape shape = shapes.get(0);
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            System.out.println(rectangle.getWidth());
        }

//        double sumArea = sumArea(shapes);
//        System.out.println("sumArea = " + sumArea);
    }

    public static double sumArea(ArrayList<Shape> shapes) {
        double res = 0.0;
        for (Shape shape : shapes) {
            res += shape.getArea();
        }
        return res;
    }
}
