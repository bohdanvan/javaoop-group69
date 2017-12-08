package com.bvan.oop.lesson3.line;

/**
 * @author bvanchuhov
 */
public class PointRunner {

    public static void main(String[] args) {
        Line line1 = new Line(new Point(0, 0), new Point(0, 3));
        System.out.println(line1.getLength()); // 3

        Line line2 = new Line(new Point(1, 0), new Point(5, 0));
        System.out.println(line2.getLength()); // 4

        Line line3 = new Line(new Point(0, 4), new Point(3, 0));
        System.out.println(line3.getLength()); // 5

        Lines lines = new Lines();
        lines.add(line1);
        lines.add(line2);
        lines.add(line3);

        Line longestLine = lines.getLongestLine();
        System.out.println("longestLine = " + longestLine);

        double sumLength = lines.getSumLength();
        System.out.println("sumLength = " + sumLength);
    }
}
