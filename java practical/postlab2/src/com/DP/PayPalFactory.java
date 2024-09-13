package com.DP;

public class PayPalFactory implements PaymentMethodFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new PayPalPayment();
    }
}