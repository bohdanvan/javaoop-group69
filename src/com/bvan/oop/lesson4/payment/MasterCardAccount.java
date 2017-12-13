package com.bvan.oop.lesson4.payment;

/**
 * @author bvanchuhov
 */
public class MasterCardAccount implements Account {

    @Override
    public boolean withdraw(long price) {
        System.out.println("MasterCard withdraw: " + price);
        return true;
    }

    @Override
    public boolean credit(long price) {
        System.out.println("MasterCard credit: " + price);
        return true;
    }
}
