package org.konik.ecommerce.orderline;

import org.konik.ecommerce.order.Order;
import org.springframework.stereotype.Service;

public record OrderLineRequest(
        Integer id,
        Integer orderId,
        Integer productId,
        double quantity
) {
    @Service
    public static class OrderLineMapper {
        public OrderLine toOrderLine(OrderLineRequest request) {
            return OrderLine.builder()
                    .productId(request.productId())
                    .order(
                            Order.builder()
                                    .id(request.orderId())
                                    .build()
                    )
                    .quantity(request.quantity())
                    .build();
        }

        public OrderLineResponse toOrderLineResponse(OrderLine orderLine) {
            return new OrderLineResponse(
                    orderLine.getId(),
                    orderLine.getQuantity()
            );
        }
    }
}
