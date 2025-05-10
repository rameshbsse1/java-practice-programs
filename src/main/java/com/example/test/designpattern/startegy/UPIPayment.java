package com.example.test.designpattern.startegy;

public class UPIPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}
