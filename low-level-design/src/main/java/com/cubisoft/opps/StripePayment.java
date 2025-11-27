package com.cubisoft.opps;

public class StripePayment implements  PaymentGateway{
    @Override
    public void initiatePayment(double amount) {
        System.out.println("Processing payment via Stripe: ₹" + amount);
    }
}
