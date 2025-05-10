package com.example.test.designpattern.startegy;

public class Main {
    public static void main(String[] args) {
        String selectedMethod = "UPI";  // assume it comes from user or config

        PaymentStrategy strategy;
        if ("CREDIT".equalsIgnoreCase(selectedMethod)) {
            strategy = new CreditCardPayment();
        } else if ("UPI".equalsIgnoreCase(selectedMethod)) {
            strategy = new UPIPayment();
        } else {
            throw new RuntimeException("Unsupported payment type");
        }

        PaymentContext context = new PaymentContext(strategy);
        context.pay(500);  // ₹500 paid using the chosen strategy
    }
}

