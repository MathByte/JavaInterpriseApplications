package com.kerbabian.khachigkerbabian_assignment_4.EJB;


import jakarta.ejb.Stateful;
import jakarta.ejb.Stateless;

@Stateless
public class AccountBeanImpl implements AccountBean{

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
