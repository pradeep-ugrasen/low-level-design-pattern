package com.cubisoft.opps;

public class RazorpayPayment implements PaymentGateway{
    @Override
    public void initiatePayment(double amount) {
        System.out.println("Processing payment via Razorpay: ₹" + amount);
    }
}
