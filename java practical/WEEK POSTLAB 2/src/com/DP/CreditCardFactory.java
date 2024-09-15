package com.DP;

public class CreditCardFactory implements PaymentMethodFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCardPayment();
    }
}
