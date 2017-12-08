package com.bvan.oop.lesson3.line;

/**
 * @author bvanchuhov
 */
public class Line {

    private final Point start;
    private final Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double getLength() {
        return Math.sqrt(
                Math.pow(start.getX() - end.getX(), 2) +
                Math.pow(start.getY() - end.getY(), 2)
        );
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return start + " -> " + end;
    }
}
