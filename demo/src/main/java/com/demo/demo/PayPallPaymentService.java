package com.demo.demo;

import org.springframework.stereotype.Service;

@Service
public class PayPallPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPall");
        System.out.println("Amount: " + amount);
    }
}
