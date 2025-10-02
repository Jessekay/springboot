package com.demo.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {
   public static void main(String[] args) {
    // SpringBootApplication.run(StoreApplication.class, args);
    var orderService = new OrderService();
   //  orderService.setPaymentService(new PayPallPaymentService());
    orderService.placeOrder();
   }
}
