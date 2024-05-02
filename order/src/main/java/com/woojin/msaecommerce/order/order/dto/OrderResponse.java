package com.woojin.msaecommerce.order.order.dto;

import com.woojin.msaecommerce.order.order.Order;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class OrderResponse {
    private Long id;

    private Long userId;

    private Long productId;

    public static OrderResponse fromEntity(Order order) {
        return OrderResponse.builder()
                .id(order.getId())
                .userId(order.getUserId())
                .productId(order.getProductId())
                .build();
    }
}
