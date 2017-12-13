package com.bvan.oop.lesson4.payment;

/**
 * @author bvanchuhov
 */
public interface Account {
    boolean withdraw(long price);
    boolean credit(long price);
}
