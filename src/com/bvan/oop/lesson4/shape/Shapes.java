package com.bvan.oop.lesson4.shape;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Shapes {

    private final List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public double getArea() {
        double res = 0.0;
        for (Shape shape : shapes) {
            res += shape.getArea();
        }
        return res;
    }
}
