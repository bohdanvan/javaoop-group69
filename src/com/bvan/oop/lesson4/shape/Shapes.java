package com.bvan.oop.lesson4.shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Shapes implements Iterable<Shape> {

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

    public void sort(Comparator<Shape> shapeComparator) {
        Collections.sort(shapes, shapeComparator);
    }

    @Override
    public Iterator<Shape> iterator() {
        return shapes.iterator();
    }
}
