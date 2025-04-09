package org.konik.ecommerce.kafka;

import org.konik.ecommerce.customer.CustomerResponse;
import org.konik.ecommerce.order.PaymentMethod;
import org.konik.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
