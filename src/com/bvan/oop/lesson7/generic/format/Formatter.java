package com.bvan.oop.lesson7.generic.format;

/**
 * @author bvanchuhov
 */
public interface Formatter<T> {

    String format(T value);
}
