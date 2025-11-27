package com.cubisoft.opps;

public class CheckoutServiceInterfaceEx {

    private  PaymentGateway paymentGateway;

    CheckoutServiceInterfaceEx(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(double amount) {
        paymentGateway.initiatePayment(amount);
    }

    public static void main(String[] args) {
        PaymentGateway stripeGateway = new StripePayment();
        CheckoutServiceInterfaceEx service = new CheckoutServiceInterfaceEx(stripeGateway);
        service.checkout(120.50);  // Output: Processing payment via Stripe: $120.5

        // Switch to Razorpay
        PaymentGateway razorpayGateway = new RazorpayPayment();
        service.setPaymentGateway(razorpayGateway);
        service.checkout(150.50);  // Output: Processing payment via Razorpay: ₹150.5
    }
}
