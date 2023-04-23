package com.example.minsunpark_assignment_4.EJB;

import jakarta.ejb.Local;
import jakarta.ejb.Stateful;

@Stateful
@Local(AccountBean.class)
public class AccountBeanImpl implements AccountBean {
    private double balance = 100;
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
