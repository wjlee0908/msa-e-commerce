package com.woojin.msaecommerce.order.order.dto;

import com.woojin.msaecommerce.order.order.OrderItem;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class OrderResponse_Item {
    private Long id;

    private Long productId;

    private Integer quantity;

    private Long productCouponId;

    public static OrderResponse_Item fromOrderItem(OrderItem item) {
        return OrderResponse_Item.builder()
                .id(item.getId())
                .productId(item.getProductId())
                .quantity(item.getQuantity())
                .productCouponId(item.getProductCouponId())
                .build();
    }
}
