package com.demo.demo;

public class PayPallPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPall");
        System.out.println("Amount: " + amount);
    }
}
