package com.bvan.oop.lesson4.payment;

/**
 * @author bvanchuhov
 */
public class VisaAccount implements Account {

    @Override
    public boolean withdraw(long price) {
        System.out.println("Visa withdraw: " + price);
        return true;
    }

    @Override
    public boolean credit(long price) {
        System.out.println("Visa credit: " + price);
        return true;
    }
}
