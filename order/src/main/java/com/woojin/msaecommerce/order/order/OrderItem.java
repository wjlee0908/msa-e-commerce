package com.woojin.msaecommerce.order.order;

import com.woojin.msaecommerce.order.order.dto.OrderRequest_Item;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class OrderItem {
    private Long id;

    private Long productId;

    private Integer quantity;

    private Long productCouponId;

    public static OrderItem fromOrderRequest(OrderRequest_Item request) {
        return OrderItem.builder()
                .id(Long.valueOf(1))
                .productId(request.getProductId())
                .quantity(request.getQuantity())
                .productCouponId(request.getProductCouponId())
                .build();
    }
}
