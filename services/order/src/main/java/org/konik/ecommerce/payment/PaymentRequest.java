package org.konik.ecommerce.payment;

import org.konik.ecommerce.customer.CustomerResponse;
import org.konik.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
