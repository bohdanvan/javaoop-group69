package com.bvan.oop.lesson3.line;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class Lines {

    private final ArrayList<Line> lines = new ArrayList<>();

    public void add(Line line) {
        lines.add(line);
    }

    public double getSumLength() {
        double res = 0.0;
        for (Line line : lines) {
            res += line.getLength();
        }
        return res;
    }

    public Line getLongestLine() {
        if (lines.isEmpty()) {
            throw new IllegalStateException("no lines");
        }

        Line longestLine = lines.get(0);
        for (Line line : lines) {
            if (longestLine.getLength() < line.getLength()) {
                longestLine = line;
            }
        }
        return longestLine;
    }
}
